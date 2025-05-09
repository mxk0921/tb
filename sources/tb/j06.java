package tb;

import androidx.collection.ArrayMap;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class j06 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final long DX_EVENT_HANDLEWIDGETEXPOSURE = -601212393052064705L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        static {
            t2o.a(478150712);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(478150711);
    }

    public static /* synthetic */ Object ipc$super(j06 j06Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/dx/DXHandleWidgetExposureEventHandler");
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        Object obj;
        Object obj2;
        String str;
        String str2;
        ArrayMap<String, Object> arrayMap;
        ml1 M;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr != null && objArr.length != 0) {
            Object obj3 = null;
            if (dXRuntimeContext != null) {
                obj = dXRuntimeContext.q();
            } else {
                obj = null;
            }
            if (!(obj instanceof Map)) {
                obj = null;
            }
            Map map = (Map) obj;
            if (map != null) {
                obj2 = map.get(xo7.TAG_DINAMICX_VIEW_COMPONENT);
            } else {
                obj2 = null;
            }
            if (!(obj2 instanceof IDMComponent)) {
                obj2 = null;
            }
            IDMComponent iDMComponent = (IDMComponent) obj2;
            Object obj4 = objArr[0];
            if (obj4 != null) {
                str = obj4.toString();
            } else {
                str = null;
            }
            if (iDMComponent != null) {
                str2 = iDMComponent.getTag();
            } else {
                str2 = null;
            }
            String concat = "_pre_".concat(String.format("Page_ShoppingCart_%s_%s", Arrays.copyOf(new Object[]{str2, str}, 2)));
            if (iDMComponent != null) {
                arrayMap = iDMComponent.getExtMap();
            } else {
                arrayMap = null;
            }
            if (arrayMap != null) {
                obj3 = arrayMap.get(concat);
            }
            if (!ckf.b(obj3, Boolean.TRUE)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (objArr.length > 1) {
                    int length = objArr.length;
                    int i2 = 0;
                    while (i < length) {
                        Object obj5 = objArr[i];
                        int i3 = i2 + 1;
                        if (i2 >= 1 && (obj5 instanceof JSONObject)) {
                            Set<Map.Entry<String, Object>> entrySet = ((JSONObject) obj5).entrySet();
                            ckf.f(entrySet, "any.entries");
                            Iterator<T> it = entrySet.iterator();
                            while (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                String str3 = (String) entry.getKey();
                                Object value = entry.getValue();
                                ckf.f(str3, "key");
                                linkedHashMap.put(str3, value.toString());
                            }
                        }
                        i++;
                        i2 = i3;
                    }
                }
                kmb b = yn2.b(dXRuntimeContext);
                if (!(b == null || (M = b.M()) == null)) {
                    M.f(iDMComponent, str, linkedHashMap);
                }
                if (arrayMap != null) {
                    arrayMap.put(concat, Boolean.TRUE);
                }
            }
        }
    }

    @Override // tb.ob5, tb.mvb
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }
}
