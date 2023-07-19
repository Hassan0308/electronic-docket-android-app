package me.blog.docket.electronicdocket.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;

import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;
import me.blog.docket.commons.constants.Constants;
import me.blog.docket.commons.utils.CommonUtils;
import me.blog.docket.commons.utils.FontUtils;
import me.blog.docket.electronicdocket.R;

/**
 * Created by CHO HANJOONG on 2016-12-31.
 */

public class IntroActivity extends Activity implements Handler.Callback {

    private final int START_MAIN_ACTIVITY = 0;

    @BindView(R.id.appName)
    TextView mAppName;

    @BindView(R.id.companyName)
    TextView mCompanyName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        ButterKnife.bind(this);

        // determine device language
        if (!Locale.getDefault().getLanguage().matches(Constants.CUSTOM_FONTS_SUPPORT_LANGUAGE)) {
            CommonUtils.saveStringPreference(this, Constants.SETTING_FONT_NAME, Constants.CUSTOM_FONTS_UNSUPPORTED_LANGUAGE_DEFAULT);
        }

        setFontsTypeface();
        setFontsSize();
        new Handler(this).sendEmptyMessageDelayed(START_MAIN_ACTIVITY, 5000);
    }



    @Override
    public boolean handleMessage(Message message) {
        switch (message.what) {
            case START_MAIN_ACTIVITY:
                startActivity(new Intent(this, DiaryMainActivity.class));
                finish();
                break;
            default:
                break;
        }
        return false;
    }

    private void setFontsTypeface() {
        FontUtils.setFontsTypeface(IntroActivity.this, getAssets(), null, mAppName, mCompanyName);
    }

    private void setFontsSize() {
        float commonSize = CommonUtils.loadFloatPreference(IntroActivity.this, Constants.SETTING_FONT_SIZE, mAppName.getTextSize());
        FontUtils.setFontsSize(commonSize, -1, mAppName, mCompanyName);
    }

}
