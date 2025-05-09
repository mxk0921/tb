package com.taobao.message.notification.banner.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.notification.banner.util.StickPublish;
import com.taobao.message.notification.util.EnvUtil;
import com.taobao.message.notification.util.TimeUtil;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class DefaultBannerView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DefaultBannerView";
    public View mReplyView;
    public View mView;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class ViewDataModel {
        public String mContent;
        public Context mContext;
        public String mGoodsUrl;
        public String mIcon;
        public StickPublish<Boolean> mInOnline;
        public String mTargetId;
        public long mTime;
        public String mTitle;

        static {
            t2o.a(610271277);
        }
    }

    static {
        t2o.a(610271276);
    }

    public static DefaultBannerView build(Context context, String str, String str2, String str3, long j, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DefaultBannerView) ipChange.ipc$dispatch("2ab7d36c", new Object[]{context, str, str2, str3, new Long(j), str4});
        }
        ViewDataModel viewDataModel = new ViewDataModel();
        viewDataModel.mContext = context;
        viewDataModel.mIcon = str;
        viewDataModel.mTitle = str2;
        viewDataModel.mContent = str3;
        viewDataModel.mGoodsUrl = str4;
        viewDataModel.mTime = j;
        return new DefaultBannerView2023().init(viewDataModel);
    }

    public int getLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("28b929a", new Object[]{this})).intValue();
        }
        return R.layout.msgcenter_push_banner;
    }

    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.mView;
    }

    public void hideReplyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("818c3f94", new Object[]{this});
        } else {
            this.mReplyView.setVisibility(8);
        }
    }

    public DefaultBannerView init(ViewDataModel viewDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DefaultBannerView) ipChange.ipc$dispatch("42090901", new Object[]{this, viewDataModel});
        }
        View inflate = LayoutInflater.from(viewDataModel.mContext).inflate(getLayout(), (ViewGroup) null);
        this.mView = inflate;
        this.mReplyView = inflate.findViewById(R.id.notification_reply);
        TUrlImageView tUrlImageView = (TUrlImageView) this.mView.findViewById(R.id.notification_icon);
        TextView textView = (TextView) this.mView.findViewById(R.id.notification_time);
        tUrlImageView.setStrategyConfig(EnvUtil.imageStrategyConfig);
        tUrlImageView.setPlaceHoldImageResId(R.drawable.alimp_default_avatar);
        tUrlImageView.setImageUrl(viewDataModel.mIcon);
        ((TextView) this.mView.findViewById(R.id.notification_title)).setText(viewDataModel.mTitle);
        ((TextView) this.mView.findViewById(R.id.notification_content)).setText(viewDataModel.mContent);
        if (Localization.p()) {
            textView.setText(TimeUtil.formatTimeForInnerNotification(viewDataModel.mTime));
        } else {
            textView.setVisibility(8);
        }
        return this;
    }

    public void hideReplyView(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76433ddc", new Object[]{this, jSONObject});
        } else {
            TLog.logd(TAG, "hideReplyView(JSONObject nativeStyle) is not implemented!");
        }
    }

    public static DefaultBannerView build(ViewDataModel viewDataModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DefaultBannerView) ipChange.ipc$dispatch("bd2fdfe3", new Object[]{viewDataModel}) : new DefaultBannerView2023().init(viewDataModel);
    }
}
