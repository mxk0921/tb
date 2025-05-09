package com.taobao.message.notification.banner.view;

import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.notification.banner.util.StickPublish;
import com.taobao.message.notification.banner.view.DefaultBannerView;
import com.taobao.message.notification.banner.view.DefaultBannerView2023;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.lang.ref.WeakReference;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class DefaultBannerView2023 extends DefaultBannerView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "DefaultBannerView2023";
    private ImageView mOnlineView;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class OnlineConsumer implements StickPublish.Consumer<Boolean> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private WeakReference<DefaultBannerView2023> mWeakReference;

        static {
            t2o.a(610271279);
            t2o.a(610271266);
        }

        public OnlineConsumer(DefaultBannerView2023 defaultBannerView2023) {
            this.mWeakReference = new WeakReference<>(defaultBannerView2023);
        }

        public void accept(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f0d4f95e", new Object[]{this, bool});
                return;
            }
            DefaultBannerView2023 defaultBannerView2023 = this.mWeakReference.get();
            if (defaultBannerView2023 != null) {
                DefaultBannerView2023.access$000(defaultBannerView2023, bool.booleanValue());
            }
        }
    }

    static {
        t2o.a(610271278);
    }

    public static /* synthetic */ void access$000(DefaultBannerView2023 defaultBannerView2023, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5502f38b", new Object[]{defaultBannerView2023, new Boolean(z)});
        } else {
            defaultBannerView2023.refreshOnlineIcon(z);
        }
    }

    public static /* synthetic */ Object ipc$super(DefaultBannerView2023 defaultBannerView2023, String str, Object... objArr) {
        if (str.hashCode() == 1107888385) {
            return super.init((DefaultBannerView.ViewDataModel) objArr[0]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/notification/banner/view/DefaultBannerView2023");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$refreshOnlineIcon$1(boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6171b076", new Object[]{this, new Boolean(z)});
            return;
        }
        ImageView imageView = this.mOnlineView;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    private void refreshOnlineIcon(final boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3980f0e6", new Object[]{this, new Boolean(z)});
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            ImageView imageView = this.mOnlineView;
            if (!z) {
                i = 8;
            }
            imageView.setVisibility(i);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: tb.by6
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultBannerView2023.this.lambda$refreshOnlineIcon$1(z);
                }
            });
        }
    }

    @Override // com.taobao.message.notification.banner.view.DefaultBannerView
    public int getLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("28b929a", new Object[]{this})).intValue();
        }
        return R.layout.msgcenter_push_banner_v2023;
    }

    @Override // com.taobao.message.notification.banner.view.DefaultBannerView
    public void hideReplyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("818c3f94", new Object[]{this});
        } else if (this.mReplyView.getVisibility() == 0) {
            ((TextView) this.mReplyView.findViewById(R.id.notification_reply_text)).setText(Localization.q(R.string.mp_notification_check));
        }
    }

    @Override // com.taobao.message.notification.banner.view.DefaultBannerView
    public DefaultBannerView2023 init(DefaultBannerView.ViewDataModel viewDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DefaultBannerView2023) ipChange.ipc$dispatch("940260e2", new Object[]{this, viewDataModel});
        }
        super.init(viewDataModel);
        if (!TextUtils.isEmpty(viewDataModel.mGoodsUrl)) {
            TUrlImageView tUrlImageView = (TUrlImageView) this.mView.findViewById(R.id.notification_icon_goods);
            tUrlImageView.setImageUrl(viewDataModel.mGoodsUrl);
            tUrlImageView.setVisibility(0);
            this.mReplyView.setVisibility(8);
        }
        this.mOnlineView = (ImageView) this.mView.findViewById(R.id.notification_icon_online);
        if (viewDataModel.mInOnline != null) {
            refreshOnlineIcon(true);
            viewDataModel.mInOnline.subscribe(new OnlineConsumer(this));
        }
        TextView textView = (TextView) this.mView.findViewById(R.id.notification_reply_text);
        if (textView != null) {
            textView.setText(Localization.q(R.string.mp_notification_reply));
        }
        return this;
    }

    @Override // com.taobao.message.notification.banner.view.DefaultBannerView
    public void hideReplyView(JSONObject jSONObject) {
        String string;
        String string2;
        String string3;
        CardView cardView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76433ddc", new Object[]{this, jSONObject});
        } else if (jSONObject != null && this.mReplyView.getVisibility() == 0) {
            TextView textView = (TextView) this.mReplyView.findViewById(R.id.notification_reply_text);
            try {
                if (jSONObject.containsKey("rBtCrHex") && (string3 = jSONObject.getString("rBtCrHex")) != null && !string3.isEmpty() && (cardView = (CardView) this.mView.findViewById(R.id.notification_reply)) != null) {
                    cardView.setCardBackgroundColor(Color.parseColor(string3));
                }
                if (jSONObject.containsKey("rBtTextCrHex") && (string2 = jSONObject.getString("rBtTextCrHex")) != null && !string2.isEmpty() && textView != null) {
                    textView.setTextColor(Color.parseColor(string2));
                }
                if (jSONObject.containsKey("rBtText") && (string = jSONObject.getString("rBtText")) != null && !string.isEmpty() && textView != null) {
                    textView.setText(string);
                }
            } catch (Throwable th) {
                TLog.loge(TAG, th.toString());
            }
        }
    }
}
