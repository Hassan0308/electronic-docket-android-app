package me.blog.docket.electronicdocket.activities;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import me.blog.docket.commons.constants.Constants;
import me.blog.docket.electronicdocket.R;

/**
 * Created by CHO HANJOONG on 2017-02-11.
 */

public class WebViewActivity extends EasyDiaryActivity {

    @BindView(R.id.licenses) WebView webView;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        ButterKnife.bind(this);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(getIntent().getStringExtra(Constants.OPEN_URL_INFO));
    }

    @OnClick({R.id.finish})
    void onClick(View view) {
        switch(view.getId()) {
            case R.id.finish:
                finish();
                break;
        }
    }

}
