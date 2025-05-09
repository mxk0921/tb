package tb;

import android.text.TextUtils;
import android.util.LruCache;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class mj5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_CONTAINERDATA = 6875012019473020234L;
    public static final Object b = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final LruCache<String, LruCache<String, Object>> f24077a = new LruCache<>(4);

    static {
        t2o.a(486539375);
    }

    public static /* synthetic */ Object ipc$super(mj5 mj5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/parser/DXDataParserContainerData");
    }

    public final Object a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2f675d8e", new Object[]{this, str, str2});
        }
        LruCache<String, Object> lruCache = this.f24077a.get(str);
        if (lruCache == null) {
            return null;
        }
        return lruCache.get(str2);
    }

    public final Object b(Object obj, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("30f55028", new Object[]{this, obj, strArr});
        }
        if (obj == null || strArr == null || strArr.length <= 0) {
            return null;
        }
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                if (obj instanceof IContainerDataModel) {
                    obj = e((IContainerDataModel) obj, str);
                } else if (obj instanceof IContainerInnerDataModel) {
                    obj = d((IContainerInnerDataModel) obj, str);
                } else if (obj instanceof JSONObject) {
                    obj = ((JSONObject) obj).get(str);
                } else if (obj instanceof List) {
                    obj = c((List) obj, str);
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

    public final Object c(List list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a415ea0a", new Object[]{this, list, str});
        }
        if (list == null) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt < 0 || parseInt >= list.size()) {
                return null;
            }
            return list.get(parseInt);
        } catch (Throwable th) {
            fve.c("home.hContainerData", "parse array data error", th);
            return null;
        }
    }

    public final void f(String str, String str2, Object obj) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97b63b39", new Object[]{this, str, str2, obj});
            return;
        }
        LruCache<String, Object> lruCache = this.f24077a.get(str);
        if (lruCache == null) {
            lruCache = new LruCache<>(32);
            this.f24077a.put(str, lruCache);
        }
        if (obj == null) {
            str3 = "null";
        } else {
            str3 = obj.toString();
        }
        fve.e("home.hContainerData", "saveCacheResult, key=", str2, ", value=", str3);
        if (obj == null) {
            obj = b;
        }
        lruCache.put(str2, obj);
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
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
                            fve.e("home.hContainerData", "key is empty");
                            return null;
                        }
                        cfc c = j18.c(dXRuntimeContext);
                        if (c == null) {
                            fve.e("home.hContainerData", "infoFlowContext is null");
                            return null;
                        }
                        IContainerDataService iContainerDataService = (IContainerDataService) c.a(IContainerDataService.class);
                        if (iContainerDataService == null) {
                            fve.e("home.hContainerData", "containerDataService is null");
                            return null;
                        }
                        IContainerDataModel containerData = iContainerDataService.getContainerData();
                        if (containerData == null) {
                            fve.e("home.hContainerData", "containerDataService is null");
                            return null;
                        }
                        String str2 = c.getContainerType().getContainerId() + containerData.getBase().getCacheTime();
                        Object a2 = a(str2, str);
                        if (a2 == null) {
                            String[] split = str.split("\\.");
                            if (split.length <= 0) {
                                return null;
                            }
                            Object b2 = b(containerData, split);
                            f(str2, str, b2);
                            return b2;
                        } else if (a2 == b) {
                            return null;
                        } else {
                            return a2;
                        }
                    }
                }
            } catch (Throwable th) {
                fve.c("home.hContainerData", "parse container data error", th);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:7:0x001a, B:14:0x002e, B:19:0x003a, B:22:0x0044, B:30:0x0055, B:32:0x005a, B:34:0x005f, B:36:0x0065), top: B:41:0x001a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel r7, java.lang.String r8) {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = tb.mj5.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0019
            java.lang.String r4 = "f47756c0"
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
            goto L_0x006f
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
            if (r2 == 0) goto L_0x005f
            if (r2 == r1) goto L_0x005a
            if (r2 == r0) goto L_0x0055
            return r3
        L_0x0055:
            com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel r7 = r7.getDelta()     // Catch: all -> 0x0038
            return r7
        L_0x005a:
            com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel r7 = r7.getBase()     // Catch: all -> 0x0038
            return r7
        L_0x005f:
            com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel r8 = r7.getBase()     // Catch: all -> 0x0038
            if (r8 == 0) goto L_0x006e
            com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel r7 = r7.getBase()     // Catch: all -> 0x0038
            com.alibaba.fastjson.JSONObject r7 = r7.getExt()     // Catch: all -> 0x0038
            return r7
        L_0x006e:
            return r3
        L_0x006f:
            java.lang.String r8 = "home.hContainerData"
            java.lang.String r0 = "parse single container data error"
            tb.fve.c(r8, r0, r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.mj5.e(com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel, java.lang.String):java.lang.Object");
    }

    public final Object d(IContainerInnerDataModel<?> iContainerInnerDataModel, String str) {
        char c = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5deacc6c", new Object[]{this, iContainerInnerDataModel, str});
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
                    return iContainerInnerDataModel.getDataType();
                case 1:
                    return Long.valueOf(iContainerInnerDataModel.getCacheTime());
                case 2:
                    return Long.valueOf(iContainerInnerDataModel.getExpTimeInterval());
                case 3:
                    return iContainerInnerDataModel.getExt();
                case 4:
                    return iContainerInnerDataModel.getSections();
                case 5:
                    return iContainerInnerDataModel.getRangerParams();
                case 6:
                    return iContainerInnerDataModel.getClientCache();
                case 7:
                    return iContainerInnerDataModel.getPassParams();
                case '\b':
                    return iContainerInnerDataModel.getPageParams();
                case '\t':
                    return iContainerInnerDataModel.getVersionInfo();
                default:
                    return null;
            }
        } catch (Throwable th) {
            fve.c("home.hContainerData", "parse single container data error", th);
            return null;
        }
    }
}
