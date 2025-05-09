package com.o2o.ad.expo;

import android.net.Uri;
import android.text.TextUtils;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.o2o.ad.click.common.O2OClickSendResponse;
import com.taobao.alimama.threads.AdThreadExecutor;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import tb.apv;
import tb.dsj;
import tb.gsj;
import tb.j4g;
import tb.jsj;
import tb.o6j;
import tb.t2o;
import tb.vzo;
import tb.wrj;
import tb.ztv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O2OExpoCommitter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_NAME = "mtop.o2o.ad.exposure.get";
    public static final Queue<String> d = new ConcurrentLinkedQueue();
    public static final Map<String, wrj> e = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final String f5978a;
    public final String b;
    public Map<String, String> c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum ResultCode {
        COMMITED,
        INVALID_URL,
        DUPLICATED,
        INTERNAL_ERROR;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ResultCode resultCode, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/o2o/ad/expo/O2OExpoCommitter$ResultCode");
        }

        public static ResultCode valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ResultCode) ipChange.ipc$dispatch("56a7a4a", new Object[]{str});
            }
            return (ResultCode) Enum.valueOf(ResultCode.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
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
                O2OExpoCommitter.a(O2OExpoCommitter.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements dsj {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1019215903);
            t2o.a(1018167315);
        }

        public b() {
        }

        @Override // tb.dsj
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6690068b", new Object[]{this, str, str2});
            }
        }

        @Override // tb.dsj
        public void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2ac6980f", new Object[]{this, str, str2});
                return;
            }
            String c = vzo.c(O2OExpoCommitter.b(O2OExpoCommitter.this));
            O2OExpoCommitter o2OExpoCommitter = O2OExpoCommitter.this;
            ztv.b("o2o_expo_request_fail", c, O2OExpoCommitter.d(o2OExpoCommitter, O2OExpoCommitter.c(o2OExpoCommitter)));
            O2OExpoCommitter o2OExpoCommitter2 = O2OExpoCommitter.this;
            j4g.a("o2o_expo_request_fail", vzo.c(O2OExpoCommitter.b(O2OExpoCommitter.this)), "expo=" + O2OExpoCommitter.c(O2OExpoCommitter.this), O2OExpoCommitter.d(o2OExpoCommitter2, O2OExpoCommitter.c(o2OExpoCommitter2)), "error_code=" + str, "error_msg=" + str2);
            O2OExpoCommitter.f().remove(O2OExpoCommitter.e(O2OExpoCommitter.this));
        }

        @Override // tb.dsj
        public void c(String str, Object obj, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc7907a3", new Object[]{this, str, obj, new Boolean(z)});
                return;
            }
            String c = vzo.c(O2OExpoCommitter.b(O2OExpoCommitter.this));
            O2OExpoCommitter o2OExpoCommitter = O2OExpoCommitter.this;
            ztv.b("o2o_expo_request_success", c, O2OExpoCommitter.d(o2OExpoCommitter, O2OExpoCommitter.c(o2OExpoCommitter)));
            O2OExpoCommitter o2OExpoCommitter2 = O2OExpoCommitter.this;
            j4g.a("o2o_expo_request_success", vzo.c(O2OExpoCommitter.b(O2OExpoCommitter.this)), "expo=" + O2OExpoCommitter.c(O2OExpoCommitter.this), O2OExpoCommitter.d(o2OExpoCommitter2, O2OExpoCommitter.c(o2OExpoCommitter2)));
            O2OExpoCommitter.f().remove(O2OExpoCommitter.e(O2OExpoCommitter.this));
            if (O2OExpoCommitter.g().size() >= 1000) {
                O2OExpoCommitter.g().poll();
            }
            O2OExpoCommitter.g().offer(O2OExpoCommitter.e(O2OExpoCommitter.this));
        }

        public /* synthetic */ b(O2OExpoCommitter o2OExpoCommitter, a aVar) {
            this();
        }
    }

    static {
        t2o.a(1019215901);
    }

    public O2OExpoCommitter(String str, Map<String, String> map) {
        this.f5978a = str;
        this.c = map;
        this.b = k(str);
    }

    public static /* synthetic */ void a(O2OExpoCommitter o2OExpoCommitter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc24d8", new Object[]{o2OExpoCommitter});
        } else {
            o2OExpoCommitter.h();
        }
    }

    public static /* synthetic */ Map b(O2OExpoCommitter o2OExpoCommitter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1469878f", new Object[]{o2OExpoCommitter});
        }
        return o2OExpoCommitter.c;
    }

    public static /* synthetic */ String c(O2OExpoCommitter o2OExpoCommitter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dd686025", new Object[]{o2OExpoCommitter});
        }
        return o2OExpoCommitter.f5978a;
    }

    public static /* synthetic */ String d(O2OExpoCommitter o2OExpoCommitter, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f88df9ba", new Object[]{o2OExpoCommitter, str});
        }
        return o2OExpoCommitter.i(str);
    }

    public static /* synthetic */ String e(O2OExpoCommitter o2OExpoCommitter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f7428e63", new Object[]{o2OExpoCommitter});
        }
        return o2OExpoCommitter.b;
    }

    public static /* synthetic */ Map f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1483fe72", new Object[0]);
        }
        return e;
    }

    public static /* synthetic */ Queue g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Queue) ipChange.ipc$dispatch("5598e1de", new Object[0]);
        }
        return d;
    }

    public static String k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("82bccd6e", new Object[]{str});
        }
        return vzo.o(str);
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0b37aab", new Object[]{this});
        } else if (((ConcurrentLinkedQueue) d).contains(this.b)) {
            ztv.b("o2o_expo_invoke_duplicated", vzo.c(this.c), i(this.f5978a));
            String c = vzo.c(this.c);
            j4g.a("o2o_expo_invoke_duplicated", c, "expo=" + this.f5978a, i(this.f5978a));
        } else {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) e;
            wrj wrjVar = (wrj) concurrentHashMap.get(this.b);
            if (wrjVar != null) {
                wrjVar.a();
                return;
            }
            O2OCpmExpoRequest o2OCpmExpoRequest = new O2OCpmExpoRequest();
            String str = this.f5978a;
            o6j o6jVar = new o6j(str, jsj.RETRY_FIVE_TIMES, o2OCpmExpoRequest, apv.b(str), O2OClickSendResponse.class);
            o6jVar.k(new b(this, null));
            concurrentHashMap.put(this.b, gsj.a().c(o6jVar));
        }
    }

    public final String i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43ce2207", new Object[]{this, str});
        }
        return "useCache=0";
    }

    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c2405f36", new Object[]{this});
        }
        Map<String, String> map = this.c;
        if (map == null || !map.containsKey(MspDBHelper.BizEntry.COLUMN_NAME_PID)) {
            try {
                String queryParameter = Uri.parse(this.f5978a).getQueryParameter(MspDBHelper.BizEntry.COLUMN_NAME_PID);
                if (!TextUtils.isEmpty(queryParameter)) {
                    if (this.c == null) {
                        this.c = new HashMap();
                    }
                    this.c.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, queryParameter);
                }
            } catch (Exception unused) {
            }
        }
        ztv.b("o2o_expo_invoke_success", vzo.c(this.c), i(this.f5978a));
        String c = vzo.c(this.c);
        j4g.a("o2o_expo_invoke_success", c, "expo=" + this.f5978a, i(this.f5978a));
        if (TextUtils.isEmpty(this.f5978a) || TextUtils.isEmpty(this.b)) {
            String c2 = vzo.c(this.c);
            j4g.a("o2o_expo_invalid_url", "msg=url_is_empty_or_hash_error", c2, "expo=" + this.f5978a, i(this.f5978a));
            return ResultCode.INVALID_URL.name();
        } else if (((ConcurrentLinkedQueue) d).contains(this.b)) {
            ztv.b("o2o_expo_invoke_duplicated", vzo.c(this.c), i(this.f5978a));
            String c3 = vzo.c(this.c);
            j4g.a("o2o_expo_invoke_duplicated", c3, "expo=" + this.f5978a, i(this.f5978a));
            return ResultCode.DUPLICATED.name();
        } else {
            AdThreadExecutor.execute(new a());
            return ResultCode.COMMITED.name();
        }
    }
}
