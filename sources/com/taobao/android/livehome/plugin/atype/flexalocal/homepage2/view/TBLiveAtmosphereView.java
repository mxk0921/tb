package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.view;

import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.uikit.api.TBLiveBaseComponentView;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.arq;
import tb.jw0;
import tb.p0;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TBLiveAtmosphereView extends TBLiveBaseComponentView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TUrlImageView mBenefitBgImg;
    private TextView mBenefitText;
    private Context mContext;
    private View mParentView;

    static {
        t2o.a(310378881);
    }

    public TBLiveAtmosphereView(Context context) {
        super(context);
        this.mContext = context;
        initView();
    }

    private void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(9, -1);
        layoutParams.addRule(12, -1);
        setGravity(80);
        layoutParams.setMargins(0, 0, 0, 0);
        setLayoutParams(layoutParams);
        View inflate = LayoutInflater.from(this.mContext).inflate(R.layout.live_home_main_card_atmosphere_flexalocal, (ViewGroup) null);
        if (inflate != null) {
            TUrlImageView tUrlImageView = (TUrlImageView) inflate.findViewById(R.id.atmosphere_bg_img);
            this.mBenefitBgImg = tUrlImageView;
            tUrlImageView.setSkipAutoSize(true);
            if (p0.h(p0.f(), "all")) {
                TextView textView = (TextView) inflate.findViewById(R.id.atmosphere_text_liveEqualAltitude);
                this.mBenefitText = textView;
                textView.setTextSize(10.0f);
            } else {
                TextView textView2 = (TextView) inflate.findViewById(R.id.atmosphere_text);
                this.mBenefitText = textView2;
                textView2.setTypeface(null, 3);
                this.mBenefitText.setTextSize(12.0f);
            }
            this.mBenefitText.setVisibility(0);
        }
        addView(inflate);
    }

    public static /* synthetic */ Object ipc$super(TBLiveAtmosphereView tBLiveAtmosphereView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/homepage2/view/TBLiveAtmosphereView");
    }

    private boolean isVisible(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("10be147d", new Object[]{this, str})).booleanValue();
        }
        if (arq.a(str) || this.mContext == null) {
            return false;
        }
        Paint paint = new Paint();
        paint.setTypeface(this.mBenefitText.getTypeface());
        paint.setTextSize(this.mBenefitText.getTextSize());
        paint.setTextAlign(this.mBenefitText.getPaint().getTextAlign());
        float measureText = paint.measureText(str);
        View view = this.mParentView;
        if (view == null || measureText + jw0.b(this.mContext, 39.0f) <= view.getMeasuredWidth()) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.taolive.uikit.api.TBLiveBaseComponentView
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            setVisibility(8);
        }
    }

    public void setData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d09acf9d", new Object[]{this, jSONObject});
        } else if (jSONObject != null && isVisible(jSONObject.getString("text"))) {
            TUrlImageView tUrlImageView = this.mBenefitBgImg;
            if (tUrlImageView != null) {
                tUrlImageView.setImageUrl(jSONObject.getString("benefitBgImg"));
            }
            TextView textView = this.mBenefitText;
            if (textView != null) {
                textView.setText(jSONObject.getString("text"));
            }
        }
    }

    public void setRootView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e9a75a2", new Object[]{this, view});
        } else {
            this.mParentView = view;
        }
    }
}
