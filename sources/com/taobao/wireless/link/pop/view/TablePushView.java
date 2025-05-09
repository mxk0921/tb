package com.taobao.wireless.link.pop.view;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.agoo.TaobaoRegister;
import com.taobao.schedule.ViewProxy;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.wireless.link.pop.PopMessageData;
import tb.abk;
import tb.aqg;
import tb.esg;
import tb.irg;
import tb.jsg;
import tb.pg1;
import tb.t2o;
import tb.xfm;
import tb.zhm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TablePushView extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static TUrlImageView mIvLeftLogo;
    private static TUrlImageView mIv_delete;
    private static TextView mTv_button;
    private static TextView mTv_sub_title;
    private static TextView mTv_title;
    private static View mView;
    public static int viewHeight;
    public static int viewWidth;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PopMessageData f14174a;
        public final /* synthetic */ Context b;

        public a(PopMessageData popMessageData, Context context) {
            this.f14174a = popMessageData;
            this.b = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                TablePushView.access$000(abk.FROM_FULL, this.f14174a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PopMessageData f14175a;
        public final /* synthetic */ Context b;

        public b(PopMessageData popMessageData, Context context) {
            this.f14175a = popMessageData;
            this.b = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                TablePushView.access$000("part", this.f14175a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f14176a;
        public final /* synthetic */ PopMessageData b;

        public c(Context context, PopMessageData popMessageData) {
            this.f14176a = context;
            this.b = popMessageData;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            xfm.d(this.f14176a, this.b);
            esg.b(esg.ARG1_POP_DELETE, "desktop_push", this.b.messageId, null);
            TaobaoRegister.dismissMessage(this.f14176a, this.b.messageId, "");
        }
    }

    static {
        t2o.a(1030750335);
    }

    public TablePushView(Context context, PopMessageData popMessageData) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.table_push_window, this);
        mView = findViewById(R.id.table_push_layout);
        mView.setLayoutParams(new LinearLayout.LayoutParams(((WindowManager) context.getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay().getWidth() - zhm.b(20.0f), zhm.b(75.0f)));
        viewHeight = mView.getLayoutParams().height;
        viewWidth = mView.getLayoutParams().width;
        mIvLeftLogo = (TUrlImageView) findViewById(R.id.iv_left_logo);
        mTv_title = (TextView) mView.findViewById(R.id.tv_title);
        mTv_sub_title = (TextView) mView.findViewById(R.id.tv_sub_title);
        mTv_button = (TextView) mView.findViewById(R.id.tv_button);
        mIv_delete = (TUrlImageView) findViewById(R.id.iv_delete);
        updateView(context, popMessageData);
    }

    public static /* synthetic */ void access$000(String str, PopMessageData popMessageData, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc7dbbd", new Object[]{str, popMessageData, context});
        } else {
            jumpInPage(str, popMessageData, context);
        }
    }

    public static /* synthetic */ Object ipc$super(TablePushView tablePushView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/wireless/link/pop/view/TablePushView");
    }

    private static void jumpInPage(String str, PopMessageData popMessageData, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf91c0ef", new Object[]{str, popMessageData, context});
            return;
        }
        irg.a("link_tag", "PopManager === TablePushView == 点击查看:" + popMessageData.rightButtonUrl);
        jsg.v(context, zhm.f32776a + "growth_dhh_2200803434487_android-overlaytop-1069565676&h5Url=" + popMessageData.rightButtonUrl, popMessageData.rightButtonUrl, "desktop_push_activity", popMessageData.messageId);
        xfm.d(context, popMessageData);
        esg.b(esg.TABLE_PUSH_CLICK, popMessageData.messageId, str, null);
        TaobaoRegister.clickMessage(context, popMessageData.messageId, "");
    }

    public static void updateTablePush(Context context, PopMessageData popMessageData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb94dd4a", new Object[]{context, popMessageData});
            return;
        }
        try {
            updateView(context, popMessageData);
        } catch (Exception e) {
            irg.b("link_tag", "TablePushView === updateTablePush === 更新tablepush异常：" + e);
        }
    }

    private static void updateView(Context context, PopMessageData popMessageData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0310859", new Object[]{context, popMessageData});
            return;
        }
        if (!TextUtils.isEmpty(popMessageData.backgroundColor)) {
            mView.setBackgroundColor(Color.parseColor(popMessageData.backgroundColor));
        }
        if (!TextUtils.isEmpty(popMessageData.leftLogoUrl)) {
            mIvLeftLogo.setStrategyConfig(ImageStrategyConfig.w("1111", "1111").a());
            mIvLeftLogo.setImageUrl(popMessageData.leftLogoUrl);
        } else if (Boolean.parseBoolean(aqg.g(context, "popMessageTablePushImageCanGone", "true"))) {
            mIvLeftLogo.setVisibility(8);
        }
        if (!TextUtils.isEmpty(popMessageData.title)) {
            mTv_title.setText(popMessageData.title);
        }
        if (!TextUtils.isEmpty(popMessageData.subTitle)) {
            mTv_sub_title.setText(popMessageData.subTitle);
        }
        if (!TextUtils.isEmpty(popMessageData.rightButtonText)) {
            mTv_button.setText(popMessageData.rightButtonText);
        }
        View view = mView;
        if (view != null) {
            ViewProxy.setOnClickListener(view, new a(popMessageData, context));
        }
        TextView textView = mTv_button;
        if (textView != null) {
            textView.setOnClickListener(new b(popMessageData, context));
        }
        TUrlImageView tUrlImageView = mIv_delete;
        if (tUrlImageView != null) {
            tUrlImageView.setOnClickListener(new c(context, popMessageData));
        }
    }
}
