package com.taobao.wireless.link.pop.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.agoo.TaobaoRegister;
import com.taobao.schedule.ViewProxy;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.wireless.link.pop.PopMessageData;
import tb.esg;
import tb.jsg;
import tb.mr4;
import tb.pg1;
import tb.t2o;
import tb.xfm;
import tb.zhm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class FullPopView extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static TUrlImageView mIv_pop;
    public static int viewHeight;
    public static int viewWidth;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f14172a;
        public final /* synthetic */ PopMessageData b;

        public a(FullPopView fullPopView, Context context, PopMessageData popMessageData) {
            this.f14172a = context;
            this.b = popMessageData;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            xfm.d(this.f14172a, this.b);
            esg.b(esg.ARG1_POP_DELETE, "desktop_pop", this.b.messageId, null);
            TaobaoRegister.dismissMessage(this.f14172a, this.b.messageId, "");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f14173a;
        public final /* synthetic */ PopMessageData b;

        public b(FullPopView fullPopView, Context context, PopMessageData popMessageData) {
            this.f14173a = context;
            this.b = popMessageData;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            xfm.d(this.f14173a, this.b);
            Context context = this.f14173a;
            PopMessageData popMessageData = this.b;
            jsg.v(context, zhm.f32776a + "growth_dhh_2200803434487_android-overlaycenter-1069565676&h5Url=" + this.b.clickUrl, popMessageData.clickUrl, "full_pop_activity", popMessageData.messageId);
            TaobaoRegister.clickMessage(this.f14173a, this.b.messageId, "");
            esg.b(esg.ARG1_FULL_POP_CLICK, this.b.clickUrl, "", null);
        }
    }

    static {
        t2o.a(1030750332);
    }

    public FullPopView(Context context, PopMessageData popMessageData) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.full_pop_window, this);
        View findViewById = findViewById(R.id.full_window_layout);
        WindowManager windowManager = (WindowManager) context.getSystemService(pg1.ATOM_EXT_window);
        findViewById.setLayoutParams(new LinearLayout.LayoutParams(windowManager.getDefaultDisplay().getWidth(), windowManager.getDefaultDisplay().getHeight()));
        int i = R.id.iv_pop;
        mIv_pop = (TUrlImageView) findViewById.findViewById(i);
        viewHeight = findViewById.getLayoutParams().height;
        viewWidth = findViewById.getLayoutParams().width;
        TUrlImageView tUrlImageView = (TUrlImageView) findViewById(R.id.iv_pop_delete);
        tUrlImageView.setStrategyConfig(ImageStrategyConfig.w("1111", "1111").a());
        tUrlImageView.setImageUrl("https://gw.alicdn.com/tfs/TB1ikB8gAP2gK0jSZPxXXacQpXa-152-152.png");
        tUrlImageView.setOnClickListener(new a(this, context, popMessageData));
        ViewProxy.setOnClickListener(findViewById(i), new b(this, context, popMessageData));
    }

    public static /* synthetic */ Object ipc$super(FullPopView fullPopView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/wireless/link/pop/view/FullPopView");
    }

    public static void updatePopView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4f76194", new Object[0]);
            return;
        }
        TUrlImageView tUrlImageView = mIv_pop;
        if (tUrlImageView != null) {
            tUrlImageView.setImageDrawable(mr4.b().i);
        }
    }
}
