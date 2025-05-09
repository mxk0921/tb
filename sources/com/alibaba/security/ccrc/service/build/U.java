package com.alibaba.security.ccrc.service.build;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.alibaba.security.ccrc.enums.InitState;
import com.alibaba.security.ccrc.interfaces.OnCcrcCallback;
import com.alibaba.security.ccrc.model.InitResult;
import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.ccrc.service.build.U;
import com.alibaba.security.wukong.behavior.sample.BehaviorRiskSample;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTTracker;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import tb.f7l;
import tb.gj8;
import tb.n3v;
import tb.oeh;
import tb.p3v;

/* compiled from: Taobao */
@M(name = {"WuKongRuleDebug"})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class U extends K {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends n3v {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public long f2572a;
        public L b;
        public CcrcService c;

        public a(CcrcService ccrcService, L l) {
            this.c = ccrcService;
            this.b = l;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 321029302) {
                super.send((UTTracker) objArr[0], (Map) objArr[1]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/ccrc/service/build/U$a");
        }

        public void a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            } else {
                this.f2572a = j;
            }
        }

        @Override // tb.n3v
        public void send(UTTracker uTTracker, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("132284b6", new Object[]{this, uTTracker, map});
                return;
            }
            super.send(uTTracker, map);
            String str = map.get(oeh.EVENTID);
            if (!TextUtils.isEmpty(str) && str.equals("19997")) {
                String str2 = map.get("PAGE");
                if (!TextUtils.isEmpty(str2) && str2.equals(Ba.i)) {
                    String str3 = map.get(oeh.ARG1);
                    if (TextUtils.isEmpty(str3) || !str3.equals("traces")) {
                        U.a(U.this, this.c, this.b, "UT数据错误", this);
                        return;
                    }
                    String str4 = map.get("data");
                    String str5 = map.get(Ba.j);
                    if (TextUtils.isEmpty(str4)) {
                        U.a(U.this, this.c, this.b, "还原数据为空", this);
                    } else if (!TextUtils.isEmpty(str5)) {
                        U u = U.this;
                        CcrcService ccrcService = this.c;
                        L l = this.b;
                        U.a(u, ccrcService, l, "端引擎推理报错(" + str5 + f7l.BRACKET_END_STR, this);
                    } else {
                        HashMap hashMap = new HashMap();
                        hashMap.put("traceInfo", str4);
                        hashMap.put("costTime", Long.valueOf(System.currentTimeMillis() - this.f2572a));
                        U.a(U.this, this.c, this.b, hashMap, this);
                    }
                }
            }
        }

        @Override // tb.n3v
        public String trackerListenerName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1d8246a2", new Object[]{this});
            }
            return "ccrc_behavior_listener";
        }
    }

    public static /* synthetic */ void a(U u, CcrcService ccrcService, L l, String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f95c3268", new Object[]{u, ccrcService, l, str, aVar});
        } else {
            u.a(ccrcService, l, str, aVar);
        }
    }

    public static /* synthetic */ Object ipc$super(U u, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/ccrc/service/build/U");
    }

    public static /* synthetic */ void a(U u, CcrcService ccrcService, L l, Map map, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6a334dd", new Object[]{u, ccrcService, l, map, aVar});
        } else {
            u.a(ccrcService, l, map, aVar);
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.K
    public boolean a(Context context, String str, String str2, L l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ddda4f0", new Object[]{this, context, str, str2, l})).booleanValue();
        }
        Map<String, Object> map = JsonUtils.toMap(str2);
        if (map == null || map.isEmpty()) {
            K.a(l, "参数异常", null);
            return true;
        }
        String str3 = (String) map.get("ccrcCode");
        if (TextUtils.isEmpty(str3)) {
            K.a(l, "参数无CcrcCode", null);
            return true;
        }
        String jSONString = JsonUtils.toJSONString(map.get(gj8.CONFIG_DATA_KEY));
        if (TextUtils.isEmpty(jSONString)) {
            K.a(l, "参数无ConfigData", null);
            return true;
        }
        String jSONString2 = JsonUtils.toJSONString(map.get("context"));
        if (TextUtils.isEmpty(jSONString2)) {
            K.a(l, "参数无Context", null);
            return true;
        }
        a(context, str3, jSONString, jSONString2, l);
        return true;
    }

    private void a(Context context, String str, String str2, final String str3, final L l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f7f15e2", new Object[]{this, context, str, str2, str3, l});
            return;
        }
        context.getSharedPreferences(rb.b + str, 0).edit().putString(Za.e, str2).commit();
        final CcrcService service = CcrcService.getService(str);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: tb.wsz
            @Override // java.lang.Runnable
            public final void run() {
                U.this.a(service, l);
            }
        }, 60000L);
        CcrcService.Config.Builder builder = new CcrcService.Config.Builder();
        StringBuilder a2 = Kb.a("rule_debug_pid");
        a2.append(UUID.randomUUID());
        service.activate(builder.setPid(a2.toString()).build(), new OnCcrcCallback() { // from class: tb.xsz
            @Override // com.alibaba.security.ccrc.interfaces.OnCcrcCallback
            public final void onInit(InitState initState, InitResult initResult) {
                U.this.a(l, service, str3, initState, initResult);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(CcrcService ccrcService, L l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b445fa01", new Object[]{this, ccrcService, l});
        } else {
            a(ccrcService, l, "执行超时", (a) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(L l, CcrcService ccrcService, String str, InitState initState, InitResult initResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6af5c20", new Object[]{this, l, ccrcService, str, initState, initResult});
        } else if (initState == InitState.INITED || initState == InitState.INIT_SUCCESS) {
            a(ccrcService, str, l);
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, initResult.getPid());
            hashMap.put("errorMsg", initResult.getErrorMsg());
            K.a(l, "悟空激活失败，请找开发排查原因", hashMap);
        }
    }

    private void a(CcrcService ccrcService, String str, L l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d562fb7", new Object[]{this, ccrcService, str, l});
            return;
        }
        a aVar = new a(ccrcService, l);
        p3v.getInstance().registerListener(aVar);
        aVar.a(System.currentTimeMillis());
        new BehaviorRiskSample("rule_debug_sid" + UUID.randomUUID().toString(), (Map) JsonUtils.parseObject(str, (Class<Object>) Map.class)).detect(ccrcService);
    }

    private void a(CcrcService ccrcService, L l, String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc36ccef", new Object[]{this, ccrcService, l, str, aVar});
            return;
        }
        K.a(l, str, null);
        ccrcService.deActivate();
        p3v.getInstance().unregisterListener(aVar);
    }

    private void a(CcrcService ccrcService, L l, Map<String, Object> map, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a1effb6", new Object[]{this, ccrcService, l, map, aVar});
            return;
        }
        K.a(l, map);
        ccrcService.deActivate();
        p3v.getInstance().unregisterListener(aVar);
    }
}
