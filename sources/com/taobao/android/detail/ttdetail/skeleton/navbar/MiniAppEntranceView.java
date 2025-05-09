package com.taobao.android.detail.ttdetail.skeleton.navbar;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.uikit.feature.features.ImageShapeFeature;
import tb.owo;
import tb.t2o;
import tb.tq4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MiniAppEntranceView extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String appID;
    private TUrlImageView ivAppIcon;
    private int originWidth = -1;
    private RelativeLayout rlContainer;
    private TextView tvAppName;

    static {
        t2o.a(912262587);
    }

    public MiniAppEntranceView(Context context) {
        super(context);
        init();
    }

    public static String getAppID(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("23fef256", new Object[]{intent});
        }
        Uri data = intent.getData();
        if (data != null) {
            return data.getQueryParameter("miniAppId");
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(MiniAppEntranceView miniAppEntranceView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/navbar/MiniAppEntranceView");
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        View inflate = LayoutInflater.from(tq4.d(this)).inflate(R.layout.tt_detail_lightapp_entrance, (ViewGroup) this, true);
        this.rlContainer = (RelativeLayout) inflate.findViewById(R.id.rl_app);
        TUrlImageView tUrlImageView = (TUrlImageView) inflate.findViewById(R.id.iv_app_icon);
        this.ivAppIcon = tUrlImageView;
        ImageShapeFeature imageShapeFeature = (ImageShapeFeature) tUrlImageView.findFeature(ImageShapeFeature.class);
        if (imageShapeFeature == null) {
            imageShapeFeature = new ImageShapeFeature();
            this.ivAppIcon.addFeature(imageShapeFeature);
        }
        float b = owo.b(tq4.d(this), 12.5f);
        imageShapeFeature.setCornerRadius(b, b, b, b);
        imageShapeFeature.setShape(0);
        TextView textView = (TextView) inflate.findViewById(R.id.tv_app_name);
        this.tvAppName = textView;
        textView.setTextColor(-1);
        setVisibility(8);
    }

    public void setAppID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("531292cb", new Object[]{this, str});
        } else {
            this.appID = str;
        }
    }

    public void updateViewStatus(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22784379", new Object[]{this, new Float(f)});
            return;
        }
        if (f > 0.99d) {
            f = 1.0f;
        }
        float f2 = 0.0f;
        if (f < 0.02d) {
            f = 0.0f;
        }
        if (this.originWidth < 0) {
            this.originWidth = this.rlContainer.getWidth();
        }
        ViewGroup.LayoutParams layoutParams = this.rlContainer.getLayoutParams();
        int i = this.originWidth;
        layoutParams.width = i - ((int) ((i - owo.b(tq4.d(this), 31.0f)) * f));
        this.rlContainer.setLayoutParams(layoutParams);
        Drawable drawable = getResources().getDrawable(R.drawable.tt_detail_actionbar_miniapp_bg);
        float f3 = 1.0f - f;
        drawable.setAlpha((int) (255.0f * f3));
        this.rlContainer.setBackgroundDrawable(drawable);
        float f4 = (f3 * 4.0f) - 3.0f;
        if (f4 >= 0.0f) {
            f2 = f4;
        }
        this.tvAppName.setAlpha(f2);
    }

    public MiniAppEntranceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public MiniAppEntranceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
