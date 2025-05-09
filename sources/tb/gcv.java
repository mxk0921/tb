package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.a;
import com.taobao.android.weex_framework.common.MUSEventTarget;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class gcv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PRE_REQUEST_DATA_TIME_TAG = "preTimeStamp";
    public static final String PRE_REQUEST_FAIL_TAG = "PreRequest_FAIL";
    public static final gcv INSTANCE = new gcv();

    /* renamed from: a  reason: collision with root package name */
    public static final HashSet<String> f19900a = kfp.e("rateList");
    public static final HashSet<String> b = kfp.e(dbv.BIZ_CART_POP);
    public static final ConcurrentHashMap<String, Pair<Long, MtopResponse>> c = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, JSONObject> d = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, a> e = new ConcurrentHashMap<>();

    @JvmStatic
    public static final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("769f891e", new Object[]{str});
        } else if (str == null || str.length() == 0) {
            e.clear();
            c.clear();
            d.clear();
        } else {
            String f = INSTANCE.f(str);
            if (f != null) {
                c.remove(f);
                d.remove(f);
                e.remove(f);
            }
        }
    }

    public static /* synthetic */ void c(gcv gcvVar, a aVar, MtopResponse mtopResponse, JSONObject jSONObject, boolean z, String str, String str2, long j, int i, Object obj) {
        String str3;
        String str4;
        long j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2349842d", new Object[]{gcvVar, aVar, mtopResponse, jSONObject, new Boolean(z), str, str2, new Long(j), new Integer(i), obj});
            return;
        }
        if ((i & 16) != 0) {
            str3 = "";
        } else {
            str3 = str;
        }
        if ((i & 32) != 0) {
            str4 = "";
        } else {
            str4 = str2;
        }
        if ((i & 64) != 0) {
            j2 = System.currentTimeMillis();
        } else {
            j2 = j;
        }
        gcvVar.b(aVar, mtopResponse, jSONObject, z, str3, str4, j2);
    }

    @JvmStatic
    public static final void l(String str, String str2, Long l, JSONObject jSONObject, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81c0cf6", new Object[]{str, str2, l, jSONObject, mtopResponse});
            return;
        }
        if (mtopResponse.getBytedata() == null) {
            c.remove(str);
        } else {
            c.put(str, new Pair<>(Long.valueOf(System.currentTimeMillis()), mtopResponse));
        }
        d.put(str, jSONObject);
        if (!b.contains(str2)) {
            INSTANCE.m(str, mtopResponse, str2, l);
        }
    }

    public final HashSet<String> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashSet) ipChange.ipc$dispatch("5e153aaa", new Object[]{this});
        }
        return f19900a;
    }

    public final String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2539e962", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        try {
            return Uri.parse(str).getQueryParameter("preRequestUniqueKey");
        } catch (Throwable th) {
            hav.a("UltronCatchException", th.getMessage());
            return null;
        }
    }

    public final boolean g(String str, a aVar) {
        MtopResponse mtopResponse;
        long currentTimeMillis;
        Long first;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8af5ba4c", new Object[]{this, str, aVar})).booleanValue();
        }
        JSONObject remove = d.remove(str);
        if (remove == null) {
            return false;
        }
        Pair<Long, MtopResponse> remove2 = c.remove(str);
        if (remove2 != null) {
            mtopResponse = remove2.getSecond();
        } else {
            mtopResponse = null;
        }
        if (remove2 == null || (first = remove2.getFirst()) == null) {
            currentTimeMillis = System.currentTimeMillis();
        } else {
            currentTimeMillis = first.longValue();
        }
        c(this, aVar, mtopResponse, remove, true, null, null, currentTimeMillis, 48, null);
        return true;
    }

    public final boolean h(String str, String str2, a aVar) {
        MtopResponse mtopResponse;
        long currentTimeMillis;
        Long first;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87560ced", new Object[]{this, str, str2, aVar})).booleanValue();
        }
        JSONObject remove = d.remove(str2);
        if (remove != null) {
            Pair<Long, MtopResponse> remove2 = c.remove(str2);
            if (remove2 != null) {
                mtopResponse = remove2.getSecond();
            } else {
                mtopResponse = null;
            }
            if (remove2 == null || (first = remove2.getFirst()) == null) {
                currentTimeMillis = System.currentTimeMillis();
            } else {
                currentTimeMillis = first.longValue();
            }
            c(this, aVar, mtopResponse, remove, true, null, null, currentTimeMillis, 48, null);
            return true;
        }
        if (!(str == null || str.length() == 0)) {
            qbv j = qbv.j();
            ckf.f(j, "UltronTradeHybridManager.getInstance()");
            String a2 = j.g().a(str2, str);
            if (a2 != null) {
                d(aVar, a2, str2, str);
                return true;
            }
        }
        return false;
    }

    public final void k(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80426bb8", new Object[]{this, str, str2});
        } else if (str2 != null && str2.length() != 0 && str != null && str.length() != 0 && !b.contains(str2)) {
            qbv j = qbv.j();
            ckf.f(j, "UltronTradeHybridManager.getInstance()");
            j.g().d(str, str2);
        }
    }

    public final void m(String str, MtopResponse mtopResponse, String str2, Long l) {
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5ad18d7", new Object[]{this, str, mtopResponse, str2, l});
            return;
        }
        try {
            byte[] bytedata = mtopResponse.getBytedata();
            JSONObject jSONObject = null;
            if (bytedata != null) {
                Charset defaultCharset = Charset.defaultCharset();
                ckf.f(defaultCharset, "Charset.defaultCharset()");
                str3 = new String(bytedata, defaultCharset);
            } else {
                str3 = null;
            }
            JSONObject parseObject = JSON.parseObject(str3);
            if (parseObject != null) {
                jSONObject = parseObject.getJSONObject("data");
            }
            if (jSONObject instanceof JSONObject) {
                jSONObject.put((JSONObject) PRE_REQUEST_DATA_TIME_TAG, (String) Long.valueOf(System.currentTimeMillis()));
            }
            if (jSONObject == null || (str4 = jSONObject.toJSONString()) == null) {
                str4 = "";
            }
            if (str4.length() > 0) {
                qbv j = qbv.j();
                ckf.f(j, "UltronTradeHybridManager.getInstance()");
                j.g().e(str, str4, str2, l);
                return;
            }
            qbv j2 = qbv.j();
            ckf.f(j2, "UltronTradeHybridManager.getInstance()");
            j2.g().e(str, PRE_REQUEST_FAIL_TAG, str2, l);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0072 A[Catch: all -> 0x006b, TryCatch #0 {all -> 0x006b, blocks: (B:30:0x0062, B:32:0x0066, B:35:0x006e, B:37:0x0072, B:39:0x0076, B:41:0x007c, B:42:0x0083, B:43:0x008b), top: B:57:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void j(com.taobao.android.weex_framework.a r5, tb.pcu r6) {
        /*
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.gcv.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "39c9d3c2"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r5
            r4[r0] = r6
            r2.ipc$dispatch(r3, r4)
            return
        L_0x0015:
            java.lang.String r2 = "instance"
            tb.ckf.g(r5, r2)
            java.lang.String r2 = "trade_weex_container"
            java.lang.String r3 = "enablePreRequetDataWithoutPreRender"
            boolean r0 = tb.v9v.i(r2, r3, r0)
            if (r0 != 0) goto L_0x0026
            return
        L_0x0026:
            boolean r0 = r5 instanceof tb.tvh
            if (r0 != 0) goto L_0x002b
            return
        L_0x002b:
            r0 = r5
            tb.tvh r0 = (tb.tvh) r0
            com.taobao.android.weex.WeexInstance r0 = r0.j()
            boolean r2 = r0 instanceof com.taobao.android.weex.instance.WeexDOMInstance
            if (r2 != 0) goto L_0x0037
            return
        L_0x0037:
            com.taobao.android.weex.instance.WeexDOMInstance r0 = (com.taobao.android.weex.instance.WeexDOMInstance) r0
            java.lang.String r0 = r0.getBundleUrl()
            if (r0 == 0) goto L_0x00ba
            r2 = 0
            if (r6 == 0) goto L_0x0045
            java.lang.String r3 = r6.b
            goto L_0x0046
        L_0x0045:
            r3 = r2
        L_0x0046:
            if (r3 == 0) goto L_0x004e
            int r4 = r3.length()
            if (r4 != 0) goto L_0x0054
        L_0x004e:
            tb.gcv r3 = tb.gcv.INSTANCE
            java.lang.String r3 = r3.f(r0)
        L_0x0054:
            if (r3 == 0) goto L_0x00ac
            int r0 = r3.length()
            if (r0 != 0) goto L_0x005d
            goto L_0x00ac
        L_0x005d:
            java.lang.String r0 = "reusePreData"
            if (r6 == 0) goto L_0x006d
            java.util.Map<java.lang.String, ? extends java.lang.Object> r4 = r6.c     // Catch: all -> 0x006b
            if (r4 == 0) goto L_0x006d
            java.lang.Object r4 = r4.get(r0)     // Catch: all -> 0x006b
            goto L_0x006e
        L_0x006b:
            goto L_0x008c
        L_0x006d:
            r4 = r2
        L_0x006e:
            boolean r4 = r4 instanceof java.lang.Boolean     // Catch: all -> 0x006b
            if (r4 == 0) goto L_0x008c
            java.util.Map<java.lang.String, ? extends java.lang.Object> r4 = r6.c     // Catch: all -> 0x006b
            if (r4 == 0) goto L_0x007a
            java.lang.Object r2 = r4.get(r0)     // Catch: all -> 0x006b
        L_0x007a:
            if (r2 == 0) goto L_0x0083
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: all -> 0x006b
            boolean r1 = r2.booleanValue()     // Catch: all -> 0x006b
            goto L_0x008c
        L_0x0083:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: all -> 0x006b
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Boolean"
            r0.<init>(r2)     // Catch: all -> 0x006b
            throw r0     // Catch: all -> 0x006b
        L_0x008c:
            if (r1 == 0) goto L_0x009e
            tb.gcv r0 = tb.gcv.INSTANCE
            if (r6 == 0) goto L_0x0097
            java.lang.String r6 = r6.f26019a
            if (r6 == 0) goto L_0x0097
            goto L_0x0099
        L_0x0097:
            java.lang.String r6 = ""
        L_0x0099:
            boolean r6 = r0.h(r6, r3, r5)
            goto L_0x00a4
        L_0x009e:
            tb.gcv r6 = tb.gcv.INSTANCE
            boolean r6 = r6.g(r3, r5)
        L_0x00a4:
            if (r6 != 0) goto L_0x00ab
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.taobao.android.weex_framework.a> r6 = tb.gcv.e
            r6.put(r3, r5)
        L_0x00ab:
            return
        L_0x00ac:
            java.lang.String r5 = "handlePreRequestDataOnWeexCallback"
            java.lang.String r6 = "uniqueKey is invalid"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6}
            java.lang.String r6 = "UltronTradeHybridPreRequestPool"
            tb.hav.g(r6, r5)
        L_0x00ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.gcv.j(com.taobao.android.weex_framework.a, tb.pcu):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0053 A[Catch: all -> 0x004a, TRY_LEAVE, TryCatch #0 {all -> 0x004a, blocks: (B:8:0x0035, B:10:0x003b, B:13:0x004d, B:15:0x0053), top: B:37:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(com.taobao.android.weex_framework.a r7, mtopsdk.mtop.domain.MtopResponse r8, com.alibaba.fastjson.JSONObject r9, boolean r10, java.lang.String r11, java.lang.String r12, long r13) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.gcv.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0032
            java.lang.Boolean r3 = new java.lang.Boolean
            r3.<init>(r10)
            java.lang.Long r10 = new java.lang.Long
            r10.<init>(r13)
            r13 = 8
            java.lang.Object[] r13 = new java.lang.Object[r13]
            r13[r1] = r6
            r13[r0] = r7
            r7 = 2
            r13[r7] = r8
            r7 = 3
            r13[r7] = r9
            r7 = 4
            r13[r7] = r3
            r7 = 5
            r13[r7] = r11
            r7 = 6
            r13[r7] = r12
            r7 = 7
            r13[r7] = r10
            java.lang.String r7 = "f58f03ad"
            r2.ipc$dispatch(r7, r13)
            return
        L_0x0032:
            r2 = 0
            if (r8 == 0) goto L_0x004c
            byte[] r3 = r8.getBytedata()     // Catch: all -> 0x004a
            if (r3 == 0) goto L_0x004c
            java.nio.charset.Charset r4 = java.nio.charset.Charset.defaultCharset()     // Catch: all -> 0x004a
            java.lang.String r5 = "Charset.defaultCharset()"
            tb.ckf.f(r4, r5)     // Catch: all -> 0x004a
            java.lang.String r5 = new java.lang.String     // Catch: all -> 0x004a
            r5.<init>(r3, r4)     // Catch: all -> 0x004a
            goto L_0x004d
        L_0x004a:
            goto L_0x0060
        L_0x004c:
            r5 = r2
        L_0x004d:
            com.alibaba.fastjson.JSONObject r3 = com.alibaba.fastjson.JSON.parseObject(r5)     // Catch: all -> 0x004a
            if (r3 == 0) goto L_0x0059
            java.lang.String r4 = "data"
            com.alibaba.fastjson.JSONObject r2 = r3.getJSONObject(r4)     // Catch: all -> 0x004a
        L_0x0059:
            if (r8 == 0) goto L_0x005e
            if (r2 == 0) goto L_0x005e
            goto L_0x005f
        L_0x005e:
            r0 = 0
        L_0x005f:
            r1 = r0
        L_0x0060:
            com.taobao.android.weex_framework.common.MUSEventTarget r0 = com.taobao.android.weex_framework.common.MUSEventTarget.MUS_DOCUMENT_TARGET
            com.alibaba.fastjson.JSONObject r3 = new com.alibaba.fastjson.JSONObject
            r3.<init>()
            java.lang.String r4 = "responseData"
            if (r2 == 0) goto L_0x0070
            r3.put(r4, r2)
            goto L_0x0075
        L_0x0070:
            java.lang.String r2 = ""
            r3.put(r4, r2)
        L_0x0075:
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            java.lang.String r14 = "preTimeStamp"
            r3.put(r14, r13)
            java.lang.String r13 = "requestData"
            r3.put(r13, r9)
            if (r10 == 0) goto L_0x008d
            if (r1 == 0) goto L_0x008d
            java.lang.String r9 = "success"
            goto L_0x008f
        L_0x008d:
            java.lang.String r9 = "fail"
        L_0x008f:
            java.lang.String r13 = "result"
            r3.put(r13, r9)
            if (r8 == 0) goto L_0x00a1
            java.lang.String r9 = "ret"
            java.lang.String[] r8 = r8.getRet()
            r3.put(r9, r8)
        L_0x00a1:
            tb.xhv r8 = tb.xhv.INSTANCE
            java.lang.String r8 = "preload.background"
            r7.dispatchEvent(r0, r8, r3)
            if (r10 == 0) goto L_0x00ad
            if (r1 != 0) goto L_0x00b0
        L_0x00ad:
            r6.k(r11, r12)
        L_0x00b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.gcv.b(com.taobao.android.weex_framework.a, mtopsdk.mtop.domain.MtopResponse, com.alibaba.fastjson.JSONObject, boolean, java.lang.String, java.lang.String, long):void");
    }

    public final void d(a aVar, String str, String str2, String str3) {
        Object obj;
        String str4;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58058c50", new Object[]{this, aVar, str, str2, str3});
            return;
        }
        try {
            if (TextUtils.isEmpty(str) || TextUtils.equals(str, PRE_REQUEST_FAIL_TAG)) {
                z = false;
            }
            JSONObject parseObject = JSON.parseObject(str);
            if (parseObject == null || (obj = parseObject.get(PRE_REQUEST_DATA_TIME_TAG)) == null) {
                obj = Long.valueOf(System.currentTimeMillis());
            }
            MUSEventTarget mUSEventTarget = MUSEventTarget.MUS_DOCUMENT_TARGET;
            JSONObject jSONObject = new JSONObject();
            if (z) {
                jSONObject.put((JSONObject) "responseData", (String) parseObject);
            } else {
                jSONObject.put((JSONObject) "responseData", "");
            }
            jSONObject.put(PRE_REQUEST_DATA_TIME_TAG, obj);
            if (z) {
                str4 = "success";
            } else {
                str4 = "fail";
            }
            jSONObject.put((JSONObject) "result", str4);
            xhv xhvVar = xhv.INSTANCE;
            aVar.dispatchEvent(mUSEventTarget, "preload.background", jSONObject);
            if (!z) {
                k(str2, str3);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    static {
        t2o.a(157286891);
    }

    @JvmStatic
    public static final void i(boolean z, JSONObject jSONObject, MtopResponse mtopResponse, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8551451", new Object[]{new Boolean(z), jSONObject, mtopResponse, l});
        } else if (v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_HYBRID_CONTAINER, "enablePreRequetDataWithoutPreRender", true) && jSONObject != null && mtopResponse != null) {
            String string = jSONObject.getString("preRequestUniqueKey");
            String str = string != null ? string : "";
            if (str.length() != 0) {
                jSONObject.remove("preRequestUniqueKey");
                String string2 = jSONObject.getString("bizName");
                String str2 = string2 != null ? string2 : "";
                jSONObject.remove("bizName");
                a aVar = e.get(str);
                if (aVar == null) {
                    l(str, str2, l, jSONObject, mtopResponse);
                } else {
                    c(INSTANCE, aVar, mtopResponse, jSONObject, z, str, str2, 0L, 64, null);
                }
            }
        }
    }
}
