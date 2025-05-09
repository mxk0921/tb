package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class nj5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_CONTAINERDATA = 6875012019473020234L;

    static {
        t2o.a(729809036);
    }

    public static /* synthetic */ Object ipc$super(nj5 nj5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/dinamic3/parser/DXDataParserContainerData");
    }

    public final Object a(Object obj, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("30f55028", new Object[]{this, obj, strArr});
        }
        if (obj == null || strArr == null || strArr.length <= 0) {
            return null;
        }
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                if (obj instanceof AwesomeGetContainerData) {
                    obj = d((AwesomeGetContainerData) obj, str);
                } else if (obj instanceof AwesomeGetContainerInnerData) {
                    obj = c((AwesomeGetContainerInnerData) obj, str);
                } else if (obj instanceof JSONObject) {
                    obj = ((JSONObject) obj).get(str);
                } else if (obj instanceof List) {
                    obj = b((List) obj, str);
                } else if (obj instanceof Map) {
                    obj = ((Map) obj).get(str);
                } else {
                    obj = null;
                }
                if (obj == null) {
                    break;
                }
            }
        }
        return obj;
    }

    public final Object b(List list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a415ea0a", new Object[]{this, list, str});
        }
        if (list == null) {
            return null;
        }
        try {
            int intValue = Integer.valueOf(str).intValue();
            if (intValue < 0 || intValue >= list.size()) {
                return null;
            }
            return list.get(intValue);
        } catch (Throwable th) {
            bqa.b("home.hContainerData", "parse array data error", th);
            return null;
        }
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null) {
            try {
                if (objArr.length >= 1) {
                    Object obj = objArr[0];
                    if (obj instanceof String) {
                        String str = (String) obj;
                        if (TextUtils.isEmpty(str)) {
                            return null;
                        }
                        String str2 = z4a.NEW_FACE_PARENT.f32522a;
                        imn d = zza.d(str2);
                        AwesomeGetContainerData u = d == null ? null : d.u(str2);
                        if (!(u == null || (split = str.split("\\.")) == null || split.length <= 0)) {
                            return a(u, split);
                        }
                        return null;
                    }
                }
            } catch (Throwable th) {
                bqa.b("home.hContainerData", "parse container data error", th);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #0 {all -> 0x0038, blocks: (B:7:0x001a, B:14:0x002e, B:19:0x003a, B:22:0x0044, B:30:0x0055, B:32:0x0058, B:34:0x005b), top: B:38:0x001a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData r7, java.lang.String r8) {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = tb.nj5.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0019
            java.lang.String r4 = "a428aa19"
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r6
            r5[r1] = r7
            r5[r0] = r8
            java.lang.Object r7 = r3.ipc$dispatch(r4, r5)
            return r7
        L_0x0019:
            r3 = 0
            int r4 = r8.hashCode()     // Catch: all -> 0x0038
            r5 = 100897(0x18a21, float:1.41387E-40)
            if (r4 == r5) goto L_0x0044
            r2 = 3016401(0x2e06d1, float:4.226878E-39)
            if (r4 == r2) goto L_0x003a
            r2 = 95468472(0x5b0bbb8, float:1.6619917E-35)
            if (r4 == r2) goto L_0x002e
            goto L_0x004d
        L_0x002e:
            java.lang.String r2 = "delta"
            boolean r8 = r8.equals(r2)     // Catch: all -> 0x0038
            if (r8 == 0) goto L_0x004d
            r2 = 2
            goto L_0x004e
        L_0x0038:
            r7 = move-exception
            goto L_0x0060
        L_0x003a:
            java.lang.String r2 = "base"
            boolean r8 = r8.equals(r2)     // Catch: all -> 0x0038
            if (r8 == 0) goto L_0x004d
            r2 = 1
            goto L_0x004e
        L_0x0044:
            java.lang.String r4 = "ext"
            boolean r8 = r8.equals(r4)     // Catch: all -> 0x0038
            if (r8 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r2 = -1
        L_0x004e:
            if (r2 == 0) goto L_0x005b
            if (r2 == r1) goto L_0x0058
            if (r2 == r0) goto L_0x0055
            return r3
        L_0x0055:
            com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData r7 = r7.delta     // Catch: all -> 0x0038
            return r7
        L_0x0058:
            com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData r7 = r7.base     // Catch: all -> 0x0038
            return r7
        L_0x005b:
            com.alibaba.fastjson.JSONObject r7 = r7.getExt()     // Catch: all -> 0x0038
            return r7
        L_0x0060:
            java.lang.String r8 = "home.hContainerData"
            java.lang.String r0 = "parse single container data error"
            tb.bqa.b(r8, r0, r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.nj5.d(com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData, java.lang.String):java.lang.Object");
    }

    public final Object c(AwesomeGetContainerInnerData awesomeGetContainerInnerData, String str) {
        char c = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("b21b568d", new Object[]{this, awesomeGetContainerInnerData, str});
        }
        try {
            switch (str.hashCode()) {
                case -1891131205:
                    if (str.equals("rangerParams")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -553589393:
                    if (str.equals("cacheTime")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -317646481:
                    if (str.equals("expTimeInterval")) {
                        break;
                    }
                    c = 65535;
                    break;
                case -200117641:
                    if (str.equals("clientCache")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 100897:
                    if (str.equals("ext")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 162740471:
                    if (str.equals("passParams")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 688769446:
                    if (str.equals("versionInfo")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 947936814:
                    if (str.equals("sections")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1183703285:
                    if (str.equals("pageParams")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 1789070852:
                    if (str.equals("dataType")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    return awesomeGetContainerInnerData.dataType;
                case 1:
                    return Long.valueOf(awesomeGetContainerInnerData.cacheTime);
                case 2:
                    return Long.valueOf(awesomeGetContainerInnerData.expTimeInterval);
                case 3:
                    return awesomeGetContainerInnerData.ext;
                case 4:
                    return awesomeGetContainerInnerData.sections;
                case 5:
                    return awesomeGetContainerInnerData.rangerParams;
                case 6:
                    return awesomeGetContainerInnerData.clientCache;
                case 7:
                    return awesomeGetContainerInnerData.passParams;
                case '\b':
                    return awesomeGetContainerInnerData.pageParams;
                case '\t':
                    return awesomeGetContainerInnerData.versionInfo;
                default:
                    return null;
            }
        } catch (Throwable th) {
            bqa.b("home.hContainerData", "parse single container data error", th);
            return null;
        }
    }
}
