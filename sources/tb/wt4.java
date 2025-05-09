package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.nexus.arch.openArch.dto_and_do.InputData;
import com.taobao.kmp.nexus.arch.openArch.dto_and_do.LocalData;
import com.taobao.kmp.nexus.arch.openArch.dto_and_do.response_declared_do.LiveDetailResponseData;
import com.taobao.kmp.nexus.arch.openArch.dto_and_do.response_declared_do.OfficialLiveInfo;
import com.taobao.message.sp.framework.model.SimpleProfile;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJSONUtils_androidKt;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import com.taobao.uniinfra_kmp.common_utils.serialization.a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class wt4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public InputData b;
    public okj c;

    /* renamed from: a  reason: collision with root package name */
    public x4j f30909a = new x4j(null, 1, null);
    public LocalData d = new LocalData();

    static {
        t2o.a(1004535855);
    }

    public static final xhv i(Ref$ObjectRef ref$ObjectRef, String str) {
        KMPJsonObject kMPJsonObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("564361da", new Object[]{ref$ObjectRef, str});
        }
        ckf.g(str, "$this$runIfNotNullOrEmpty");
        Object a2 = KMPJSONUtils_androidKt.a(a.Companion, str);
        if (a2 instanceof KMPJsonObject) {
            kMPJsonObject = (KMPJsonObject) a2;
        } else {
            kMPJsonObject = null;
        }
        if (kMPJsonObject == null) {
            return null;
        }
        ((Map) ref$ObjectRef.element).putAll(kMPJsonObject.toMap());
        return xhv.INSTANCE;
    }

    public final String A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b3eb2ac9", new Object[]{this});
        }
        okj okjVar = this.c;
        if (okjVar != null) {
            return okjVar.h();
        }
        return null;
    }

    public final InputData B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputData) ipChange.ipc$dispatch("c5d554c4", new Object[]{this});
        }
        return this.b;
    }

    public final LocalData C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocalData) ipChange.ipc$dispatch("4ec06964", new Object[]{this});
        }
        return this.d;
    }

    public final x4j D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x4j) ipChange.ipc$dispatch("1c56bf42", new Object[]{this});
        }
        return this.f30909a;
    }

    public final okj E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (okj) ipChange.ipc$dispatch("ea3eaa44", new Object[]{this});
        }
        return this.c;
    }

    public final Map<String, String> F(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ebee8c5e", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        String h = mhr.g0().h(str);
        int Y = wsq.Y(h, "liveAlgoParams:", 0, false, 6, null);
        if (Y == -1) {
            return null;
        }
        String substring = h.substring(Y);
        ckf.f(substring, "substring(...)");
        int Y2 = wsq.Y(substring, "&", 0, false, 6, null);
        if (Y2 != -1) {
            str2 = substring.substring(15, Y2);
            ckf.f(str2, "substring(...)");
        } else {
            str2 = substring.substring(15);
            ckf.f(str2, "substring(...)");
        }
        return c(str2);
    }

    public final void G(InputData inputData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb6143b6", new Object[]{this, inputData});
        } else {
            this.b = inputData;
        }
    }

    public final void H(okj okjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eeb76a2", new Object[]{this, okjVar});
        } else {
            this.c = okjVar;
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0306f9b", new Object[]{this});
            return;
        }
        String str = null;
        this.f30909a = new x4j(null, 1, null);
        this.b = null;
        this.d = new LocalData();
        this.c = null;
        pus pusVar = pus.INSTANCE;
        StringBuilder sb = new StringBuilder("destory coredata ");
        sb.append(this.d.isLiveDetailHasRequest());
        sb.append(' ');
        okj okjVar = this.c;
        if (okjVar != null) {
            str = okjVar.f();
        }
        sb.append(str);
        pusVar.k("LiveEngine", "", sb.toString());
    }

    public final Map<String, String> c(String str) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("545c90b2", new Object[]{this, str});
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str2 : wsq.y0(str, new char[]{'#'}, false, 0, 6, null)) {
            List y0 = wsq.y0(str2, new char[]{oqw.DIVISION}, false, 2, 2, null);
            Object obj2 = y0.get(0);
            if (1 < y0.size()) {
                obj = y0.get(1);
            } else {
                obj = "";
            }
            Pair a2 = jpu.a(obj2, obj);
            String str3 = (String) a2.component1();
            String str4 = (String) a2.component2();
            if (str3.length() > 0 && str4.length() > 0) {
                linkedHashMap.put(str3, mhr.g0().h(str4));
            }
        }
        return linkedHashMap;
    }

    public final String d() {
        Object obj;
        Map<String, Object> rawData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("39c069f0", new Object[]{this});
        }
        InputData inputData = this.b;
        if (inputData == null || (rawData = inputData.getRawData()) == null) {
            obj = null;
        } else {
            obj = rawData.get("clickid");
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final Map<String, String> e() {
        Map<String, Object> rawData;
        Map<String, Object> rawData2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7d65a1a4", new Object[]{this});
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, String> b = xt4.INSTANCE.b();
        if (b != null) {
            for (Map.Entry<String, String> entry : b.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                InputData inputData = this.b;
                Object obj = null;
                if (((inputData == null || (rawData2 = inputData.getRawData()) == null) ? null : rawData2.get(key)) instanceof String) {
                    InputData inputData2 = this.b;
                    if (!(inputData2 == null || (rawData = inputData2.getRawData()) == null)) {
                        obj = rawData.get(key);
                    }
                    ckf.e(obj, "null cannot be cast to non-null type kotlin.String");
                    linkedHashMap.put(value, (String) obj);
                }
            }
        }
        return linkedHashMap;
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("52d892a7", new Object[]{this});
        }
        okj okjVar = this.c;
        if (okjVar != null) {
            return okjVar.b();
        }
        return null;
    }

    public final String g() {
        String c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c560803a", new Object[]{this});
        }
        okj okjVar = this.c;
        if (okjVar == null || (c = okjVar.c()) == null) {
            return "";
        }
        return c;
    }

    public final String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d133318e", new Object[]{this});
        }
        okj okjVar = this.c;
        if (okjVar != null) {
            return okjVar.d();
        }
        return null;
    }

    public final String l() {
        Map<String, Object> rawData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("30f591ea", new Object[]{this});
        }
        InputData inputData = this.b;
        Object obj = (inputData == null || (rawData = inputData.getRawData()) == null) ? null : rawData.get(yj4.PARAM_LIVE_AD_PARAMS);
        String str = obj instanceof String ? (String) obj : null;
        if (str != null) {
            return mhr.g0().encode(str);
        }
        return null;
    }

    public final Map<String, String> m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("504665db", new Object[]{this});
        }
        return F(x());
    }

    public final String n() {
        String str;
        String str2;
        String str3;
        String str4;
        LiveDetailResponseData a2;
        Long liveId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2ce04b18", new Object[]{this});
        }
        x4j x4jVar = this.f30909a;
        String str5 = null;
        if (x4jVar == null || (a2 = x4jVar.a()) == null || (liveId = a2.getLiveId()) == null) {
            str = null;
        } else {
            str = liveId.toString();
        }
        if (tvr.c(str)) {
            InputData inputData = this.b;
            if (inputData != null) {
                str2 = inputData.getFeedId();
            } else {
                str2 = null;
            }
            if (!tvr.c(str2)) {
                InputData inputData2 = this.b;
                if (inputData2 != null) {
                    str5 = inputData2.getFeedId();
                }
                ckf.d(str5);
            } else {
                InputData inputData3 = this.b;
                if (inputData3 != null) {
                    str3 = inputData3.getLiveId();
                } else {
                    str3 = null;
                }
                if (!tvr.c(str3)) {
                    InputData inputData4 = this.b;
                    if (inputData4 != null) {
                        str5 = inputData4.getLiveId();
                    }
                    ckf.d(str5);
                } else {
                    InputData inputData5 = this.b;
                    if (inputData5 != null) {
                        str4 = inputData5.getId();
                    } else {
                        str4 = null;
                    }
                    if (!tvr.c(str4)) {
                        InputData inputData6 = this.b;
                        if (inputData6 != null) {
                            str5 = inputData6.getId();
                        }
                        ckf.d(str5);
                    }
                }
            }
            str = str5;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String p() {
        String str;
        InputData inputData;
        String livesource;
        String liveSource;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9ede1318", new Object[]{this});
        }
        InputData inputData2 = this.b;
        String str2 = null;
        if (inputData2 != null) {
            str = inputData2.getLiveSource();
        } else {
            str = null;
        }
        if (!tvr.c(str)) {
            InputData inputData3 = this.b;
            if (inputData3 == null || (liveSource = inputData3.getLiveSource()) == null) {
                return "";
            }
            return liveSource;
        }
        InputData inputData4 = this.b;
        if (inputData4 != null) {
            str2 = inputData4.getLivesource();
        }
        if (tvr.c(str2) || (inputData = this.b) == null || (livesource = inputData.getLivesource()) == null) {
            return "";
        }
        return livesource;
    }

    public final String q() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1476ea06", new Object[]{this});
        }
        if (this.d.getLiveToken() == null) {
            LocalData localData = this.d;
            okj okjVar = this.c;
            if (okjVar == null || (str = okjVar.e()) == null) {
                str = jvs.Companion.a();
            }
            localData.setLiveToken(str);
        }
        String liveToken = this.d.getLiveToken();
        if (liveToken == null) {
            return jvs.Companion.a();
        }
        return liveToken;
    }

    public final String r() {
        LiveDetailResponseData a2;
        OfficialLiveInfo officialLiveInfo;
        LiveDetailResponseData a3;
        OfficialLiveInfo officialLiveInfo2;
        LiveDetailResponseData a4;
        LiveDetailResponseData a5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7f3d53ba", new Object[]{this});
        }
        x4j x4jVar = this.f30909a;
        String str = null;
        if (!ckf.b((x4jVar == null || (a5 = x4jVar.a()) == null) ? null : a5.getDetailType(), "2")) {
            x4j x4jVar2 = this.f30909a;
            if (ckf.b((x4jVar2 == null || (a4 = x4jVar2.a()) == null) ? null : a4.getRoomStatus(), "1")) {
                x4j x4jVar3 = this.f30909a;
                if (ckf.b((x4jVar3 == null || (a3 = x4jVar3.a()) == null || (officialLiveInfo2 = a3.getOfficialLiveInfo()) == null) ? null : officialLiveInfo2.getOfficialLive(), "official")) {
                    return "1";
                }
                x4j x4jVar4 = this.f30909a;
                if (!(x4jVar4 == null || (a2 = x4jVar4.a()) == null || (officialLiveInfo = a2.getOfficialLiveInfo()) == null)) {
                    str = officialLiveInfo.getOfficialLive();
                }
                if (ckf.b(str, "rebroadcast")) {
                    return "2";
                }
            }
        }
        return "0";
    }

    public final String s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cbab9d9", new Object[]{this});
        }
        InputData inputData = this.b;
        String str = null;
        if (tvr.c(inputData != null ? inputData.getProductType() : null)) {
            return "live";
        }
        InputData inputData2 = this.b;
        if (inputData2 != null) {
            str = inputData2.getProductType();
        }
        ckf.d(str);
        return str;
    }

    public final String t() {
        String trackInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c45bfa5e", new Object[]{this});
        }
        InputData inputData = this.b;
        if (inputData == null || (trackInfo = inputData.getTrackInfo()) == null) {
            return "";
        }
        Object a0 = i04.a0(wsq.z0(trackInfo, new String[]{"_"}, false, 0, 6, null));
        ckf.e(a0, "null cannot be cast to non-null type kotlin.String");
        String str = (String) a0;
        return str.length() > 64 ? "" : str;
    }

    public final String u() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("422fc23", new Object[]{this});
        }
        okj okjVar = this.c;
        String str2 = null;
        if (okjVar != null) {
            str = okjVar.a();
        } else {
            str = null;
        }
        if (tvr.c(str)) {
            return "a2141.8001249";
        }
        okj okjVar2 = this.c;
        if (okjVar2 != null) {
            str2 = okjVar2.a();
        }
        ckf.d(str2);
        return str2;
    }

    public final String v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7b5cc3a0", new Object[]{this});
        }
        InputData inputData = this.b;
        if (inputData != null) {
            return inputData.getSpm();
        }
        return null;
    }

    public final String x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a9fa9d5a", new Object[]{this});
        }
        InputData inputData = this.b;
        if (inputData != null) {
            return inputData.getTrackInfo();
        }
        return null;
    }

    public final Map<String, Object> z() {
        String utparam;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d3dfd824", new Object[]{this});
        }
        InputData inputData = this.b;
        if (inputData == null || (utparam = inputData.getUtparam()) == null) {
            return null;
        }
        return xrf.b(utparam);
    }

    public final String j() {
        String livesource;
        List<String> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca8decb2", new Object[]{this});
        }
        InputData inputData = this.b;
        Object obj = null;
        Map<String, Object> rawData = inputData != null ? inputData.getRawData() : null;
        if (rawData == null) {
            return "0";
        }
        Object obj2 = rawData.get("cpa_adTransParams");
        if (obj2 != null) {
            if (!tvr.b(obj2)) {
                obj2 = null;
            }
            if (obj2 != null) {
                return "1";
            }
        }
        Object obj3 = rawData.get(yj4.PARAM_MEDIA_INFO_ADTRANSPARAMS);
        if (obj3 != null) {
            if (!tvr.b(obj3)) {
                obj3 = null;
            }
            if (obj3 != null) {
                return "1";
            }
        }
        Object obj4 = rawData.get("alimama");
        if (obj4 != null) {
            if (!tvr.b(obj4)) {
                obj4 = null;
            }
            if (obj4 != null) {
                return "1";
            }
        }
        InputData inputData2 = this.b;
        if (inputData2 != null && (livesource = inputData2.getLivesource()) != null && (a2 = xt4.INSTANCE.a()) != null && a2.contains(livesource)) {
            return "1";
        }
        InputData inputData3 = this.b;
        if (inputData3 != null && inputData3.getClickid() != null) {
            return "1";
        }
        Object obj5 = rawData.get("adEurlParams");
        if (obj5 != null) {
            if (!tvr.b(obj5)) {
                obj5 = null;
            }
            if (obj5 != null) {
                return "1";
            }
        }
        Object obj6 = rawData.get(yj4.PARAM_LIVE_IS_AD);
        if (obj6 == null) {
            return "0";
        }
        if (tvr.e(tvr.g(obj6))) {
            obj = obj6;
        }
        if (obj != null) {
            return "1";
        }
        return "0";
    }

    public final String w() {
        Map<String, Object> rawData;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("391d6f11", new Object[]{this});
        }
        KMPJsonObject kMPJsonObject = new KMPJsonObject(null, 1, null);
        InputData inputData = this.b;
        if (!(inputData == null || (rawData = inputData.getRawData()) == null || (obj = rawData.get(yj4.PARAM_TCP_OUTER_PARAM)) == null)) {
            kMPJsonObject.put(yj4.PARAM_TCP_OUTER_PARAM, obj);
        }
        String jsonString = kMPJsonObject.toJsonString();
        return jsonString == null ? "" : jsonString;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String o() {
        /*
            r14 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.wt4.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "2c562585"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r14
            java.lang.Object r0 = r2.ipc$dispatch(r3, r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0015:
            tb.pus r2 = tb.pus.INSTANCE
            java.lang.String r3 = "LiveEngine-MessageManager"
            java.lang.String r4 = ""
            java.lang.String r5 = "fetchLiveItemId end"
            r2.f(r3, r4, r5)
            tb.avs r2 = tb.avs.INSTANCE
            java.lang.String r6 = "liveItemIdLiveSourceFilter"
            java.lang.String r7 = "mainsearchlive;mainsearchpicture.feeds"
            java.lang.String r8 = r2.h(r6, r7)
            java.lang.String r2 = ";"
            java.lang.String[] r9 = new java.lang.String[]{r2}
            r10 = 0
            r11 = 0
            r12 = 6
            r13 = 0
            java.util.List r2 = tb.wsq.z0(r8, r9, r10, r11, r12, r13)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
            r6 = 0
        L_0x0041:
            boolean r7 = r2.hasNext()
            r8 = 0
            if (r7 == 0) goto L_0x005b
            java.lang.Object r7 = r2.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r9 = r14.p()
            r10 = 2
            boolean r7 = tb.tsq.I(r9, r7, r0, r10, r8)
            if (r7 == 0) goto L_0x0041
            r6 = 1
            goto L_0x0041
        L_0x005b:
            if (r6 == 0) goto L_0x0073
            java.util.Map r0 = r14.z()
            if (r0 == 0) goto L_0x006b
            java.lang.String r2 = "item_id"
            java.lang.Object r0 = r0.get(r2)
            goto L_0x006c
        L_0x006b:
            r0 = r8
        L_0x006c:
            boolean r2 = r0 instanceof java.lang.String
            if (r2 == 0) goto L_0x0073
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0074
        L_0x0073:
            r0 = r8
        L_0x0074:
            boolean r2 = tb.tvr.c(r0)
            if (r2 == 0) goto L_0x008e
            tb.avs r2 = tb.avs.INSTANCE
            java.lang.String r6 = "liveItemIdToPmParams"
            boolean r1 = r2.d(r6, r1)
            if (r1 == 0) goto L_0x008e
            com.taobao.kmp.nexus.arch.openArch.dto_and_do.InputData r0 = r14.b
            if (r0 == 0) goto L_0x008d
            java.lang.String r8 = r0.getLiveItemId()
        L_0x008d:
            r0 = r8
        L_0x008e:
            tb.pus r1 = tb.pus.INSTANCE
            r1.f(r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.wt4.o():java.lang.String");
    }

    public final Map<String, Object> y() {
        Map<String, Object> rawData;
        Map<String, Object> rawData2;
        Map<String, Object> customedSpfPlayVideo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3a6fcb0", new Object[]{this});
        }
        InputData inputData = this.b;
        String transparentKey = inputData != null ? inputData.getTransparentKey() : null;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (tvr.c(transparentKey)) {
            InputData inputData2 = this.b;
            String goodsManager = inputData2 != null ? inputData2.getGoodsManager() : null;
            if (tvr.c(goodsManager) || !Boolean.parseBoolean(goodsManager)) {
                InputData inputData3 = this.b;
                Object obj = (inputData3 == null || (customedSpfPlayVideo = inputData3.getCustomedSpfPlayVideo()) == null) ? null : customedSpfPlayVideo.get("timeMovingUtParams");
                if (obj == null || !(obj instanceof Map)) {
                    InputData inputData4 = this.b;
                    String timeMovingSpfPlayVideo = inputData4 != null ? inputData4.getTimeMovingSpfPlayVideo() : null;
                    if (timeMovingSpfPlayVideo != null) {
                        Map<String, Object> b = xrf.b(timeMovingSpfPlayVideo);
                        Object obj2 = b != null ? b.get("timeMovingUtParams") : null;
                        if (obj2 instanceof Map) {
                            Object obj3 = ((Map) obj2).get("pcmId");
                            if (!tvr.c(obj3)) {
                                linkedHashMap.put("pcmId", obj3 instanceof String ? (String) obj3 : null);
                            }
                        }
                    }
                } else {
                    Object obj4 = ((Map) obj).get("pcmId");
                    if (!tvr.c(obj4)) {
                        linkedHashMap.put("pcmId", obj4 instanceof String ? (String) obj4 : null);
                    }
                }
            }
            InputData inputData5 = this.b;
            if (!(inputData5 == null || inputData5.getSpm() == null)) {
                InputData inputData6 = this.b;
                linkedHashMap.put("spm", inputData6 != null ? inputData6.getSpm() : null);
            }
            InputData inputData7 = this.b;
            if (!(inputData7 == null || inputData7.getMixLiveRoomTppParam() == null)) {
                InputData inputData8 = this.b;
                linkedHashMap.put("tppParam", inputData8 != null ? inputData8.getMixLiveRoomTppParam() : null);
            }
            InputData inputData9 = this.b;
            if ((inputData9 != null ? inputData9.getLivesourcePre() : null) != null) {
                Object obj5 = linkedHashMap.get("tppParam");
                Map map = obj5 instanceof Map ? (Map) obj5 : null;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                if (map != null) {
                    linkedHashMap2.putAll(map);
                }
                InputData inputData10 = this.b;
                linkedHashMap2.put("entryLiveSourcePre", inputData10 != null ? inputData10.getLivesourcePre() : null);
                linkedHashMap.put("tppParam", linkedHashMap2);
            }
            InputData inputData11 = this.b;
            String huanduanParams = inputData11 != null ? inputData11.getHuanduanParams() : null;
            List y0 = huanduanParams != null ? wsq.y0(huanduanParams, new char[]{','}, false, 0, 6, null) : null;
            if (y0 != null) {
                for (Object obj6 : y0) {
                    if (!tvr.c(obj6) && (obj6 instanceof String)) {
                        InputData inputData12 = this.b;
                        linkedHashMap.put(obj6, (inputData12 == null || (rawData2 = inputData12.getRawData()) == null) ? null : rawData2.get(obj6));
                    }
                }
            }
        } else {
            List<Object> a2 = transparentKey != null ? xrf.a(transparentKey) : null;
            if (a2 != null) {
                for (Object obj7 : a2) {
                    if (!tvr.c(obj7) && (obj7 instanceof String)) {
                        InputData inputData13 = this.b;
                        linkedHashMap.put(obj7, (inputData13 == null || (rawData = inputData13.getRawData()) == null) ? null : rawData.get(obj7));
                    }
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.util.Map] */
    public final Map<String, Object> h() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String liveDetailExtJson;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("77e3fcf8", new Object[]{this});
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        InputData inputData = this.b;
        if (inputData == null || (str = inputData.getSignature()) == null) {
            str = "";
        }
        Pair a2 = jpu.a(SimpleProfile.KEY_SIGNATURE, str);
        Pair a3 = jpu.a("timestamp", Long.valueOf(ju6.a()));
        InputData inputData2 = this.b;
        if (inputData2 == null || (str2 = inputData2.getSpm()) == null) {
            str2 = "";
        }
        Pair a4 = jpu.a("spm", str2);
        InputData inputData3 = this.b;
        if (inputData3 == null || (str3 = inputData3.getContent()) == null) {
            str3 = "";
        }
        Pair a5 = jpu.a("content", str3);
        InputData inputData4 = this.b;
        if (inputData4 == null || (str4 = inputData4.getSharerId()) == null) {
            str4 = "";
        }
        Pair a6 = jpu.a(yj4.PARAM_SHARER_ID, str4);
        InputData inputData5 = this.b;
        if (inputData5 == null || (str5 = inputData5.getAnchorGuard()) == null) {
            str5 = "";
        }
        Pair a7 = jpu.a("anchorGuard", str5);
        Pair a8 = jpu.a("guardAnchorSwitch", "true");
        Pair a9 = jpu.a("version", "202107");
        Pair a10 = jpu.a("supportItemH5", "1");
        InputData inputData6 = this.b;
        if (inputData6 == null || (str6 = inputData6.getHighPriorityBizCode()) == null) {
            str6 = "";
        }
        Pair a11 = jpu.a(yj4.PARAM_HIGH_PRIORITY_BIZ_CODE, str6);
        InputData inputData7 = this.b;
        if (inputData7 == null || (str7 = inputData7.getItemid()) == null) {
            str7 = "";
        }
        Pair a12 = jpu.a("itemid", str7);
        InputData inputData8 = this.b;
        if (inputData8 == null || (str8 = inputData8.getSjsdParams()) == null) {
            str8 = "";
            str9 = str8;
        } else {
            str9 = "";
        }
        Pair a13 = jpu.a("sjsdParams", str8);
        InputData inputData9 = this.b;
        if (inputData9 == null || (str9 = inputData9.getNeedProcSjsd()) == null) {
        }
        ref$ObjectRef.element = kotlin.collections.a.k(a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, jpu.a("needProcSjsd", str9));
        if (jvs.Companion.b()) {
            ((Map) ref$ObjectRef.element).put("fandomNativeClose", "true");
        }
        InputData inputData10 = this.b;
        if (!(inputData10 == null || (liveDetailExtJson = inputData10.getLiveDetailExtJson()) == null)) {
            xhv xhvVar = (xhv) tvr.f(liveDetailExtJson, new g1a() { // from class: tb.vt4
                @Override // tb.g1a
                public final Object invoke(Object obj) {
                    xhv i;
                    i = wt4.i(Ref$ObjectRef.this, (String) obj);
                    return i;
                }
            });
        }
        return (Map) ref$ObjectRef.element;
    }
}
