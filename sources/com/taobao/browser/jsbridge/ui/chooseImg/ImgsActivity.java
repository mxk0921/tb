package com.taobao.browser.jsbridge.ui.chooseImg;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.jsbridge.ui.chooseImg.ImgsAdapter;
import com.taobao.taobao.R;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import tb.acq;
import tb.f7l;
import tb.fm2;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ImgsActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String TAG = ImgsActivity.class.getSimpleName();
    public Bundle bundle;
    public Button choise_button;
    public RelativeLayout chooseImgLayout;
    public ArrayList<String> fileList;
    public FileTraversal fileTraversal;
    public GridView imgGridView;
    public ImgsAdapter imgsAdapter;
    public ImgChooseUtils util;
    public int imgCount = 0;
    public int maxSelect = 9;
    public ImgCallBack imgCallBack = new ImgCallBack() { // from class: com.taobao.browser.jsbridge.ui.chooseImg.ImgsActivity.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.browser.jsbridge.ui.chooseImg.ImgCallBack
        public void resultImgCall(ImageView imageView, Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff219569", new Object[]{this, imageView, bitmap});
            } else {
                imageView.setImageBitmap(bitmap);
            }
        }
    };
    public ImgsAdapter.OnItemClickClass onItemClickClass = new ImgsAdapter.OnItemClickClass() { // from class: com.taobao.browser.jsbridge.ui.chooseImg.ImgsActivity.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.browser.jsbridge.ui.chooseImg.ImgsAdapter.OnItemClickClass
        public void OnItemClick(View view, int i, CheckBox checkBox) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("78df95c5", new Object[]{this, view, new Integer(i), checkBox});
                return;
            }
            String str = ImgsActivity.this.fileTraversal.fileContent.get(i);
            if (checkBox.isChecked()) {
                checkBox.setChecked(false);
                ImgsActivity imgsActivity = ImgsActivity.this;
                imgsActivity.imgCount--;
                imgsActivity.fileList.remove(str);
                ImgsActivity.this.choise_button.setText("确定(" + ImgsActivity.this.imgCount + "/" + ImgsActivity.this.maxSelect + f7l.BRACKET_END_STR);
                return;
            }
            try {
                checkBox.setChecked(true);
                if (ImgsActivity.this.iconImage(str, i, checkBox) != null) {
                    ImgsActivity imgsActivity2 = ImgsActivity.this;
                    if (imgsActivity2.imgCount >= imgsActivity2.maxSelect) {
                        imgsActivity2.util.showNotiDlg("最多能够传" + ImgsActivity.this.maxSelect + "张图片");
                        checkBox.setChecked(false);
                        return;
                    }
                    imgsActivity2.fileList.add(str);
                    ImgsActivity imgsActivity3 = ImgsActivity.this;
                    imgsActivity3.imgCount++;
                    imgsActivity3.choise_button.setText("确定(" + ImgsActivity.this.imgCount + "/" + ImgsActivity.this.maxSelect + f7l.BRACKET_END_STR);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    };

    static {
        t2o.a(619708604);
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.imgGridView = (GridView) findViewById(R.id.imgGridView);
        Bundle extras = getIntent().getExtras();
        this.bundle = extras;
        if (fm2.commonConfig.j) {
            int i = extras.getInt("index");
            ImgChooseUtils imgChooseUtils = new ImgChooseUtils(this);
            this.util = imgChooseUtils;
            List<FileTraversal> LocalImgFileList = imgChooseUtils.LocalImgFileList();
            if (i >= LocalImgFileList.size() || i < 0) {
                finish();
                return;
            }
            this.fileTraversal = LocalImgFileList.get(i);
        } else {
            this.fileTraversal = (FileTraversal) extras.getParcelable("data");
        }
        ImgsAdapter imgsAdapter = new ImgsAdapter(this, this.fileTraversal.fileContent, this.onItemClickClass);
        this.imgsAdapter = imgsAdapter;
        this.imgGridView.setAdapter((ListAdapter) imgsAdapter);
        this.chooseImgLayout = (RelativeLayout) findViewById(R.id.chooseImgLayout);
        this.choise_button = (Button) findViewById(R.id.buttonOk);
        this.fileList = new ArrayList<>();
        this.util = new ImgChooseUtils(this);
        ((TextView) findViewById(R.id.notiText)).setVisibility(8);
        this.maxSelect = getIntent().getIntExtra("maxSelect", 9);
        Button button = this.choise_button;
        button.setText("确定(0/" + this.maxSelect + f7l.BRACKET_END_STR);
        this.choise_button.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.browser.jsbridge.ui.chooseImg.ImgsActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                Intent intent = ImgsActivity.this.getIntent();
                intent.putExtra("fileList", ImgsActivity.this.fileList);
                ImgsActivity.this.setResult(-1, intent);
                ImgsActivity.this.finish();
            }
        });
    }

    public static /* synthetic */ Object ipc$super(ImgsActivity imgsActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else if (hashCode == 1150324634) {
            super.finish();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/browser/jsbridge/ui/chooseImg/ImgsActivity");
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        this.imgsAdapter = null;
        ImgChooseUtils imgChooseUtils = this.util;
        if (imgChooseUtils != null) {
            imgChooseUtils.clear();
        }
        this.util = null;
        super.finish();
    }

    public ImageView iconImage(String str, int i, CheckBox checkBox) throws FileNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("8c2cb86d", new Object[]{this, str, new Integer(i), checkBox});
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.chooseImgLayout.getMeasuredHeight() - 10, this.chooseImgLayout.getMeasuredHeight() - 10);
        ImageView imageView = new ImageView(this);
        imageView.setLayoutParams(layoutParams);
        imageView.setAlpha(1.0f);
        imageView.setOnClickListener(new ImgOnclick(str, checkBox));
        return imageView;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.camera_photogrally);
        init();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class ImgOnclick implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public CheckBox checkBox;
        public String filepath;

        static {
            t2o.a(619708608);
        }

        public ImgOnclick(String str, CheckBox checkBox) {
            this.filepath = str;
            this.checkBox = checkBox;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            this.checkBox.setChecked(false);
            ImgsActivity imgsActivity = ImgsActivity.this;
            imgsActivity.imgCount--;
            imgsActivity.choise_button.setText("确定(" + ImgsActivity.this.imgCount + "/" + ImgsActivity.this.maxSelect + f7l.BRACKET_END_STR);
            ImgsActivity.this.fileList.remove(this.filepath);
        }
    }
}
