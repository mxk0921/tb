package com.alibaba.ut.abtest.pipeline.accs;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.config.model.keep.KeepModel;
import com.alibaba.ut.abtest.event.EventType;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.base.TaoBaseService;
import java.util.HashSet;
import tb.bj8;
import tb.go8;
import tb.ku0;
import tb.n;
import tb.ogh;
import tb.po8;
import tb.qo8;
import tb.ro8;
import tb.t2o;
import tb.uwf;
import tb.ydt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class EvoAccsService extends TaoBaseService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACCS_BETA_SINGLE = "accs_beta_single";
    public static final String SERVICE_ID = "evo-service";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f3380a;

        public a(String str) {
            this.f3380a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                po8 po8Var = (po8) uwf.a(this.f3380a, po8.class);
                if (!(po8Var == null || po8Var.indexData == null)) {
                    n.j().g().a(new bj8(EventType.ExperimentV5Data, po8Var.indexData, "accs_sync_grey"));
                    return;
                }
                ogh.i("EvoAccsService", "实验数据索引数据为空或格式错误。");
                ku0.g(ku0.SERVICE_ALARM, "experiment_index_json_illegal", "0", "accs_sync_grey", false);
            } catch (Throwable th) {
                ku0.j("EvoAccsService.syncGreyConfig", th);
            }
        }
    }

    static {
        t2o.a(961544420);
    }

    public static void a(byte[] bArr) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d754cb8", new Object[]{bArr});
        } else if (n.j().a().c() || n.j().a().A()) {
            String str = new String(bArr);
            try {
                jSONObject = JSON.parseObject(str);
            } catch (Exception unused) {
                ogh.i("EvoAccsService", "【ACCS数据】下发数据parseJson失败：".concat(str));
                jSONObject = null;
            }
            ogh.i("EvoAccsService", "【ACCS数据】本设备收到accs数据为：".concat(str));
            if (jSONObject != null) {
                String string = jSONObject.getString("command");
                if (n.j().a().c() && "syncWhiteList".equals(string)) {
                    d(jSONObject.getJSONObject("parameter"));
                } else if (n.j().a().A() && "syncBetaConfig".equals(string)) {
                    b(jSONObject.getString("parameter"));
                } else if (n.j().a().s() && "syncBetaAndReleaseConfig".equals(string)) {
                    c(jSONObject.getString("parameter"));
                }
            }
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79a6d51e", new Object[]{str});
        } else if (str != null) {
            ro8 g = go8.g(str.getBytes(), ACCS_BETA_SINGLE);
            if (g == null || g.c == null) {
                ogh.i("EvoAccsService", "【ACCS数据】下发数据中，并未包含实验。");
            } else {
                qo8.s().D(g.c, 5);
            }
        }
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c99d8d", new Object[]{str});
        } else if (str != null) {
            ydt.b(new a(str));
        }
    }

    public static /* synthetic */ Object ipc$super(EvoAccsService evoAccsService, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ut/abtest/pipeline/accs/EvoAccsService");
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onBind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fa398db", new Object[]{this, str, new Integer(i), extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onData(String str, String str2, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("694255fc", new Object[]{this, str, str2, str3, bArr, extraInfo});
        } else {
            a(bArr);
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onResponse(String str, String str2, int i, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5239c42", new Object[]{this, str, str2, new Integer(i), bArr, extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onSendData(String str, String str2, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f29e89fa", new Object[]{this, str, str2, new Integer(i), extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onUnbind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b4e074", new Object[]{this, str, new Integer(i), extraInfo});
        }
    }

    public static void d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34d582bd", new Object[]{jSONObject});
        } else if (jSONObject != null) {
            jSONObject.getString("sign");
            JSONArray jSONArray = jSONObject.getJSONArray(KeepModel.STRATEGY_WHITE_LIST);
            if (jSONArray == null || jSONArray.size() == 0) {
                n.j().d().k(new HashSet());
                return;
            }
            JSONObject jSONObject2 = jSONArray.getJSONObject(0);
            if (jSONObject2 == null) {
                n.j().d().k(new HashSet());
                return;
            }
            JSONArray jSONArray2 = jSONObject2.getJSONArray("buckets");
            if (jSONArray2 == null) {
                n.j().d().k(new HashSet());
                return;
            }
            HashSet hashSet = new HashSet();
            for (int i = 0; i < jSONArray2.size(); i++) {
                Long l = jSONArray2.getLong(i);
                if (l != null) {
                    hashSet.add(l);
                }
            }
            n.j().d().k(hashSet);
        }
    }
}
