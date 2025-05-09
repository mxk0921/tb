package com.taobao.android.live.plugin.atype.flexalocal.smartlanding;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.x2;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.smartlanding.ImageDialogAction;
import com.taobao.android.nav.Nav;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.uikit.feature.features.RatioFeature;
import java.io.Serializable;
import tb.fkx;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ImageDialogAction implements DialogInterface.OnDismissListener, Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f8657a;
    public final ImageDialogParams b;
    public final Dialog c;
    public final View d;
    public Handler e = new Handler(this);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class ImageDialogParams implements Serializable {
        public String actionUrl;
        public String icon;
        public float ratio = 1.056f;
        public int width = x2.o;
        public boolean apng = false;
        public long duration = 0;

        static {
            t2o.a(295699705);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                ImageDialogAction.b(ImageDialogAction.this);
            }
        }
    }

    static {
        t2o.a(295699703);
    }

    public ImageDialogAction(Context context, JSONObject jSONObject) {
        this.f8657a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.ubee_image_dialog_flexalocal, (ViewGroup) null);
        this.d = inflate;
        Dialog dialog = new Dialog(context, R.style.Ubee_Alert_Dialog);
        this.c = dialog;
        dialog.setContentView(inflate);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setOnDismissListener(this);
        View findViewById = dialog.findViewById(R.id.ubee_dialog_close);
        if (findViewById != null) {
            ViewProxy.setOnClickListener(findViewById, new a());
        }
        ImageDialogParams imageDialogParams = (ImageDialogParams) fkx.f(jSONObject.getString("params"), ImageDialogParams.class);
        this.b = imageDialogParams;
        View findViewById2 = dialog.findViewById(R.id.content);
        TUrlImageView tUrlImageView = (TUrlImageView) dialog.findViewById(R.id.image);
        tUrlImageView.setSkipAutoSize(imageDialogParams.apng);
        tUrlImageView.setImageUrl(imageDialogParams.icon);
        int h = h(context, imageDialogParams.width);
        RatioFeature ratioFeature = new RatioFeature();
        ratioFeature.setRatio(imageDialogParams.ratio);
        tUrlImageView.addFeature(ratioFeature);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) findViewById2.getLayoutParams();
        layoutParams.gravity = 17;
        layoutParams.width = h;
        layoutParams.height = (int) (h * imageDialogParams.ratio);
        findViewById2.setLayoutParams(layoutParams);
        final String str = imageDialogParams.actionUrl;
        ViewProxy.setOnClickListener(findViewById2, new View.OnClickListener() { // from class: tb.tke
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageDialogAction.this.e(str, view);
            }
        });
    }

    public static /* synthetic */ void b(ImageDialogAction imageDialogAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63d3cd22", new Object[]{imageDialogAction});
        } else {
            imageDialogAction.d();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        Handler handler = this.e;
        if (handler != null) {
            handler.removeMessages(101);
            this.e = null;
        }
    }

    public final void d() {
        Dialog dialog;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
            return;
        }
        Handler handler = this.e;
        if (handler != null) {
            handler.removeMessages(101);
        }
        Context context = this.f8657a;
        if ((!(context instanceof Activity) || !((Activity) context).isFinishing()) && (dialog = this.c) != null) {
            dialog.dismiss();
        }
    }

    public final /* synthetic */ void e(String str, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1045b1fb", new Object[]{this, str, view});
        } else if (!TextUtils.isEmpty(str)) {
            Nav.from(this.f8657a).toUri(str);
            d();
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        Context context = this.f8657a;
        if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
            Dialog dialog = this.c;
            if (dialog != null) {
                dialog.show();
            }
            g();
        }
    }

    public final void g() {
        Handler handler;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aca0bf3", new Object[]{this});
            return;
        }
        ImageDialogParams imageDialogParams = this.b;
        if (imageDialogParams != null) {
            long j = imageDialogParams.duration;
            if (j > 0 && (handler = this.e) != null) {
                handler.sendEmptyMessageDelayed(101, j * 1000);
            }
        }
    }

    public final int h(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b8beff6e", new Object[]{this, context, new Float(f)})).intValue();
        }
        return (int) (((f * context.getResources().getDisplayMetrics().widthPixels) * 1.0f) / 750.0f);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        if (message.what == 101) {
            d();
        }
        return false;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
        }
    }
}
