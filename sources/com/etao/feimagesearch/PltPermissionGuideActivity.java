package com.etao.feimagesearch;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.acq;
import tb.b8m;
import tb.caa;
import tb.ckf;
import tb.cql;
import tb.p1p;
import tb.pzl;
import tb.qrl;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class PltPermissionGuideActivity extends FEISBaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                PltPermissionGuideActivity.this.finish();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f4623a;
        public final /* synthetic */ PltPermissionGuideActivity b;

        public b(int i, PltPermissionGuideActivity pltPermissionGuideActivity) {
            this.f4623a = i;
            this.b = pltPermissionGuideActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            TLogTracker.f(pzl.MONITOR_PERMISSION_REQUEST, "jumpSys", ckf.p("requestType:", Integer.valueOf(this.f4623a)));
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", caa.c().getPackageName(), null));
            this.b.getActivity().startActivity(intent);
            this.b.finish();
        }
    }

    static {
        t2o.a(730857484);
    }

    public static /* synthetic */ Object ipc$super(PltPermissionGuideActivity pltPermissionGuideActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/etao/feimagesearch/PltPermissionGuideActivity");
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // com.etao.feimagesearch.FEISBaseActivity, com.etao.feimagesearch.ISBaseActivity, com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i;
        int i2;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.feis_activity_permission_guide);
        b8m.INSTANCE.c();
        int e = qrl.e(cql.b(getIntent()).get("permissionType"), 0);
        View findViewById = findViewById(R.id.fl_container);
        GradientDrawable gradientDrawable = new GradientDrawable();
        float b2 = p1p.b(6.5f);
        gradientDrawable.setCornerRadii(new float[]{b2, b2, b2, b2, 0.0f, 0.0f, 0.0f, 0.0f});
        gradientDrawable.setColor(Color.parseColor("#FFFFFF"));
        findViewById.setBackground(gradientDrawable);
        TUrlImageView tUrlImageView = (TUrlImageView) findViewById(R.id.btn_close);
        tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN01zcYkvd21JZ8qUmvWf_!!6000000006964-49-tps-384-384.webp");
        tUrlImageView.setOnClickListener(new a());
        TextView textView = (TextView) findViewById(R.id.tv_title);
        if (e == 1) {
            i = R.string.plt_permission_media_guide_title;
        } else {
            i = R.string.plt_permission_camera_guide_title;
        }
        textView.setText(Localization.q(i));
        TextView textView2 = (TextView) findViewById(R.id.tv_content);
        if (e == 1) {
            i2 = R.string.plt_permission_media_guide_content;
        } else {
            i2 = R.string.plt_permission_camera_guide_content;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Localization.q(i2));
        if (!Localization.o()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#FF6200")), 15, 27, 18);
        }
        textView2.setText(spannableStringBuilder);
        if (e == 1) {
            TextView textView3 = (TextView) findViewById(R.id.tv_sub_content);
            textView3.setVisibility(0);
            textView3.setText(Localization.q(R.string.plt_permission_media_guide_sub_content));
        }
        TUrlImageView tUrlImageView2 = (TUrlImageView) findViewById(R.id.tiv_content);
        if (Localization.p()) {
            if (e == 1) {
                str = "https://gw.alicdn.com/imgextra/i1/O1CN016YFQ8s27Dy194VFBP_!!6000000007764-49-tps-1000-1340.webp";
            } else {
                str = "https://gw.alicdn.com/imgextra/i4/O1CN01OZ8LD91NO4QfH5TX3_!!6000000001559-49-tps-1000-1340.webp";
            }
        } else if (e == 1) {
            str = "https://gw.alicdn.com/imgextra/i2/O1CN011WNN6y1iKVHEGhhKt_!!6000000004394-49-tps-1000-1340.webp";
        } else {
            str = "https://gw.alicdn.com/imgextra/i1/O1CN01oiDha71Pgy0HUDFRp_!!6000000001871-49-tps-1000-1340.webp";
        }
        tUrlImageView2.setImageUrl(str);
        TextView textView4 = (TextView) findViewById(R.id.btn_setting);
        textView4.setText(Localization.q(R.string.plt_jump_setting_permission));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(Color.parseColor("#FF6200"));
        gradientDrawable2.setCornerRadius(p1p.b(6.0f));
        textView4.setBackground(gradientDrawable2);
        textView4.setOnClickListener(new b(e, this));
    }
}
