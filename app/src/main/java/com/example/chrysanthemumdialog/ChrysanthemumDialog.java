package com.example.chrysanthemumdialog;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

/**
 * Created by BigFaceBear on 2017.10.31
 */

public class ChrysanthemumDialog extends Dialog {

    private String mContent;

    public ChrysanthemumDialog(@NonNull Context context) {
        this(context, null);
    }

    public ChrysanthemumDialog(@NonNull Context context, String content) {
        super(context, R.style.ChrysanthemumDialog);

        mContent = content;

        initDialog(context);

        //设置布局文件
        setContentView(R.layout.dialog_chrysanthemum);

        initView();
    }

    private void initDialog(Context context) {
        setCancelable(false);
        setCanceledOnTouchOutside(false);
    }

    private void initView() {
        TextView tvContent = findViewById(R.id.tvContent);

        if (mContent == null || mContent.length() == 0) {
            tvContent.setVisibility(View.GONE);
        } else {
            tvContent.setVisibility(View.VISIBLE);
            tvContent.setText(mContent);
        }

    }
}
