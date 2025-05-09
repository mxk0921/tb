package com.alibaba.android.ultron.engine;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import anetwork.channel.Response;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.alibaba.android.ultron.engine.template.TemplateInfo;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.hjt;
import tb.t2o;
import tb.yv6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class TemplateDownloadActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public TextView f2255a;
    public String b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TemplateDownloadActivity.a(TemplateDownloadActivity.this);
            }
        }
    }

    static {
        t2o.a(157286403);
    }

    public static /* synthetic */ void a(TemplateDownloadActivity templateDownloadActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a1a2a22", new Object[]{templateDownloadActivity});
        } else {
            templateDownloadActivity.b();
        }
    }

    public static /* synthetic */ Object ipc$super(TemplateDownloadActivity templateDownloadActivity, String str, Object... objArr) {
        if (str.hashCode() == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/engine/TemplateDownloadActivity");
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
        } else {
            this.f2255a = (TextView) findViewById(R.id.template_mock_info);
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7157237", new Object[]{this});
            return;
        }
        String e = e();
        this.b = e;
        this.f2255a.setText(e);
        if (this.b != null) {
            TextView textView = this.f2255a;
            textView.setText(this.b + "\n模板信息获取中...");
            this.f2255a.postDelayed(new a(), 20L);
        }
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2408abd", new Object[]{this});
        }
        try {
            return getIntent().getData().toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        if (!yv6.b(this)) {
            finish();
            return;
        }
        setContentView(R.layout.activity_template_mock);
        c();
        d();
    }

    public final void b() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("605714a9", new Object[]{this});
            return;
        }
        JSONObject jSONObject = null;
        Response syncSend = new DegradableNetwork(this).syncSend(new RequestImpl(this.b), null);
        int statusCode = syncSend.getStatusCode();
        try {
            jSONObject = (JSONObject) JSON.parse(new String(syncSend.getBytedata()));
        } catch (Exception unused) {
        }
        if (jSONObject != null && jSONObject.getBoolean("success").booleanValue()) {
            z = true;
        }
        if (statusCode != 200 || !z) {
            TextView textView = this.f2255a;
            textView.setText(this.b + "\n模板信息获取失败: " + statusCode);
            return;
        }
        TextView textView2 = this.f2255a;
        textView2.setText(this.b + "\n模板信息获取成功, mock模板替换完成");
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        if (jSONObject2 != null) {
            TemplateInfo templateInfo = new TemplateInfo();
            templateInfo.setTemplateId(jSONObject2.getString("templateId"));
            templateInfo.setVersion(jSONObject2.getString("version"));
            String string = jSONObject2.getString("scenario");
            if ("detail".equals(string)) {
                string = "detail2";
            }
            hjt hjtVar = new hjt(this, string);
            hjt.g.clear();
            hjtVar.q(templateInfo, jSONObject2);
            TextView textView3 = this.f2255a;
            textView3.setText(((Object) this.f2255a.getText()) + "\n" + templateInfo.toString());
        }
    }
}
