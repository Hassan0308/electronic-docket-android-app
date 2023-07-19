package me.blog.docket.electronicdocket.chart;

import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;

import java.text.DecimalFormat;

import me.blog.docket.electronicdocket.R;
import me.blog.docket.electronicdocket.activities.BarChartActivity;

public class MyAxisValueFormatter implements IAxisValueFormatter
{

    private DecimalFormat mFormat;

    BarChartActivity barChartActivity;

    public MyAxisValueFormatter(BarChartActivity barChartActivity) {
        this.barChartActivity = barChartActivity;
        mFormat = new DecimalFormat("###,###,###,##0");
    }

    @Override
    public String getFormattedValue(float value, AxisBase axis) {
        return mFormat.format(value) + barChartActivity.getString(R.string.diary_count);
    }
}
