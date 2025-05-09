package com.taobao.cainiao.logistic.ui.view;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.taobao.R;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.acq;
import tb.coa;
import tb.dbl;
import tb.jql;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class LogisticDetailActivity extends FragmentActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f10261a;
    public MtopBusiness b;

    static {
        t2o.a(713032021);
    }

    public static /* synthetic */ Object ipc$super(LogisticDetailActivity logisticDetailActivity, String str, Object... objArr) {
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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/cainiao/logistic/ui/view/LogisticDetailActivity");
        }
    }

    public static /* synthetic */ String l3(LogisticDetailActivity logisticDetailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("90d8046a", new Object[]{logisticDetailActivity});
        }
        return logisticDetailActivity.f10261a;
    }

    public static /* synthetic */ MtopBusiness m3(LogisticDetailActivity logisticDetailActivity, MtopBusiness mtopBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBusiness) ipChange.ipc$dispatch("e3c31c7d", new Object[]{logisticDetailActivity, mtopBusiness});
        }
        logisticDetailActivity.b = mtopBusiness;
        return mtopBusiness;
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
        super.finish();
        MtopBusiness mtopBusiness = this.b;
        if (mtopBusiness != null) {
            mtopBusiness.cancelRequest();
        }
    }

    public final String n3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4e2b1c1d", new Object[]{this});
        }
        Intent intent = getIntent();
        if (intent == null) {
            return "";
        }
        ComponentName component = intent.getComponent();
        StringBuilder sb = new StringBuilder("componentName:");
        if (component != null) {
            sb.append(component.getPackageName());
            sb.append("|");
            sb.append(component.getClassName());
        } else {
            sb.append("null");
        }
        sb.append("#Intent:");
        if (intent.getData() != null) {
            sb.append(intent.getData().toString());
        } else {
            sb.append("null");
        }
        return sb.toString();
    }

    public final void o3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6ac7538", new Object[]{this, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("bizOrderId", (Object) str);
        jSONObject2.put("originalJumpUrl", (Object) this.f10261a);
        jSONObject.put("params", (Object) coa.a(jSONObject2.toJSONString()));
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.taobao.logistics.detail.route");
        mtopRequest.setVersion("1.0");
        mtopRequest.setData(jSONObject.toJSONString());
        MtopBusiness build = MtopBusiness.build(mtopRequest);
        this.b = build;
        build.reqMethod(MethodEnum.GET);
        this.b.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.cainiao.logistic.ui.view.LogisticDetailActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                String str2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                Nav.from(LogisticDetailActivity.this).toUri(LogisticDetailActivity.l3(LogisticDetailActivity.this));
                LogisticDetailActivity.m3(LogisticDetailActivity.this, null);
                if (mtopResponse != null) {
                    str2 = mtopResponse.toString();
                } else {
                    str2 = "";
                }
                TLog.loge("LogisticDetailActivity", "logistics.detail.route onError ", str2);
                LogisticDetailActivity.this.finish();
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                try {
                    JSONObject parseObject = JSON.parseObject(new String(mtopResponse.getBytedata()));
                    if (parseObject.getJSONObject("data") != null) {
                        String string = parseObject.getJSONObject("data").getString("result");
                        if (!TextUtils.isEmpty(string)) {
                            Nav.from(LogisticDetailActivity.this).toUri(string);
                            LogisticDetailActivity.this.finish();
                            return;
                        }
                    }
                } catch (Exception e) {
                    TLog.loge("LogisticDetailActivity", "logistics.detail.route error ", e);
                }
                Nav.from(LogisticDetailActivity.this).toUri(LogisticDetailActivity.l3(LogisticDetailActivity.this));
                LogisticDetailActivity.m3(LogisticDetailActivity.this, null);
                LogisticDetailActivity.this.finish();
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                String str2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                Nav.from(LogisticDetailActivity.this).toUri(LogisticDetailActivity.l3(LogisticDetailActivity.this));
                LogisticDetailActivity.m3(LogisticDetailActivity.this, null);
                if (mtopResponse != null) {
                    str2 = mtopResponse.toString();
                } else {
                    str2 = "";
                }
                TLog.loge("LogisticDetailActivity", "logistics.detail.route onSystemError ", str2);
                LogisticDetailActivity.this.finish();
            }
        });
        this.b.startRequest();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        getWindow().setStatusBarColor(0);
        setContentView(R.layout.activity_cn_logistic);
        String g = jql.g(getIntent());
        if (!TextUtils.isEmpty(g)) {
            this.f10261a = dbl.k();
            String trim = g.trim();
            this.f10261a += trim;
            o3(trim);
        } else {
            String l = jql.l(getIntent(), "mailNo");
            String l2 = jql.l(getIntent(), CoreConstants.IN_PARAMS_ORDER_CODE);
            this.f10261a = dbl.g();
            if (!TextUtils.isEmpty(l)) {
                this.f10261a += "%26mailNo%3D" + l.trim();
            }
            if (!TextUtils.isEmpty(l2)) {
                this.f10261a += "%26orderCode%3D" + l2.trim();
            }
            Nav.from(this).toUri(this.f10261a);
            finish();
        }
        TLog.loge("LogisticDetailActivity", "intent = " + n3() + " origin url = " + this.f10261a);
    }
}
