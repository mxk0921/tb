package com.taobao.android.behavix.megaAbility;

import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsBehaviXAbility;
import com.taobao.android.behavix.service.BUFS;
import com.taobao.android.external.BHXVisualCenterItem;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.cqv;
import tb.f82;
import tb.gwv;
import tb.j82;
import tb.jdb;
import tb.k82;
import tb.kdb;
import tb.l82;
import tb.m82;
import tb.om1;
import tb.p82;
import tb.rm1;
import tb.t2o;
import tb.tao;
import tb.v82;
import tb.z82;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class BehaviXAndroidAbility extends AbsBehaviXAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public float screenHeight;
    public float screenWidth;

    static {
        t2o.a(404750531);
    }

    public BehaviXAndroidAbility() {
        this.screenWidth = 0.0f;
        this.screenHeight = 0.0f;
        DisplayMetrics displayMetrics = f82.d().getResources().getDisplayMetrics();
        this.screenWidth = displayMetrics.widthPixels;
        this.screenHeight = displayMetrics.heightPixels;
    }

    private static ErrorResult buildResult(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("19022486", new Object[]{str, str2});
        }
        return new ErrorResult(str, str2);
    }

    private static BHXVisualCenterItem convertVisualItem(l82 l82Var) {
        Double d;
        Double d2;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BHXVisualCenterItem) ipChange.ipc$dispatch("e9e413ee", new Object[]{l82Var});
        }
        if (l82Var == null) {
            return null;
        }
        BHXVisualCenterItem bHXVisualCenterItem = new BHXVisualCenterItem();
        bHXVisualCenterItem.f27464a = l82Var.f23165a;
        om1 om1Var = new om1();
        k82 k82Var = l82Var.b;
        if (!(k82Var == null || (d = k82Var.f22461a) == null || k82Var.b == null || k82Var.c == null || k82Var.d == null)) {
            om1Var.f25484a = gwv.i(d.floatValue());
            om1Var.b = gwv.i(l82Var.b.b.floatValue());
            om1Var.c = gwv.i(l82Var.b.c.floatValue());
            om1Var.d = gwv.i(l82Var.b.d.floatValue());
            bHXVisualCenterItem.b = om1Var;
            bHXVisualCenterItem.g = l82Var.f;
            bHXVisualCenterItem.e = l82Var.d;
            bHXVisualCenterItem.f = l82Var.e;
            Integer num = l82Var.c;
            if (num != null) {
                i = num.intValue();
            }
            bHXVisualCenterItem.d = i;
            om1 om1Var2 = new om1();
            k82 k82Var2 = l82Var.g;
            if (!(k82Var2 == null || (d2 = k82Var2.f22461a) == null || k82Var2.b == null || k82Var2.c == null || k82Var2.d == null)) {
                om1Var2.f25484a = gwv.i(d2.floatValue());
                om1Var2.b = gwv.i(l82Var.g.b.floatValue());
                om1Var2.c = gwv.i(l82Var.g.c.floatValue());
                om1Var2.d = gwv.i(l82Var.g.d.floatValue());
                bHXVisualCenterItem.c = om1Var2;
                HashMap hashMap = new HashMap();
                Map<String, ? extends Object> map = l82Var.h;
                if (map != null) {
                    for (String str : map.keySet()) {
                        hashMap.put(str, ensureObjectToString(l82Var.h.get(str)));
                    }
                }
                bHXVisualCenterItem.h = hashMap;
                return bHXVisualCenterItem;
            }
        }
        return null;
    }

    private static String ensureObjectToString(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4a9e6394", new Object[]{obj});
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj != null) {
            return JSON.toJSONString(obj);
        }
        return "";
    }

    public static /* synthetic */ Object ipc$super(BehaviXAndroidAbility behaviXAndroidAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavix/megaAbility/BehaviXAndroidAbility");
    }

    private void updateItemRect(List<? extends rm1> list, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47d7f6da", new Object[]{this, list, view});
        } else if (view != null) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            om1 om1Var = ((rm1) list.get(0)).c;
            if (v82.c.k()) {
                iArr[0] = 0;
            }
            float f = om1Var.f25484a + iArr[0];
            float f2 = om1Var.b + iArr[1];
            float min = Math.min(om1Var.c + f, this.screenWidth) - f;
            float min2 = Math.min(om1Var.d + f2, this.screenHeight) - f2;
            for (rm1 rm1Var : list) {
                om1 om1Var2 = rm1Var.c;
                om1Var2.f25484a = f;
                om1Var2.b = f2;
                om1Var2.c = min;
                om1Var2.d = min2;
                om1 om1Var3 = rm1Var.b;
                om1Var3.f25484a += iArr[0];
                om1Var3.b += iArr[1];
            }
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsBehaviXAbility
    public void commitVisualCenter(kdb kdbVar, m82 m82Var, jdb jdbVar) {
        List<l82> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb41b1ce", new Object[]{this, kdbVar, m82Var, jdbVar});
            return;
        }
        try {
            if (!TextUtils.isEmpty(m82Var.f23838a) && (list = m82Var.b) != null && !list.isEmpty()) {
                String str = m82Var.f23838a;
                ArrayList arrayList = new ArrayList();
                for (l82 l82Var : m82Var.b) {
                    BHXVisualCenterItem convertVisualItem = convertVisualItem(l82Var);
                    if (convertVisualItem != null) {
                        arrayList.add(convertVisualItem);
                    }
                }
                if (arrayList.isEmpty()) {
                    jdbVar.O(buildResult("401", "No items were successfully converted"));
                    return;
                }
                updateItemRect(arrayList, kdbVar.k());
                updateItemPosition(arrayList, kdbVar.k());
                boolean equals = Boolean.TRUE.equals(Boolean.valueOf(m82Var.c));
                HashMap hashMap = new HashMap();
                Map<String, ? extends Object> map = m82Var.d;
                if (map != null) {
                    for (String str2 : map.keySet()) {
                        hashMap.put(str2, ensureObjectToString(m82Var.d.get(str2)));
                    }
                }
                cqv.w(str, arrayList, equals, hashMap);
                return;
            }
            jdbVar.O(buildResult("401", "Missing or invalid parameter"));
        } catch (Throwable th) {
            jdbVar.O(buildResult("502", th.getMessage()));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsBehaviXAbility
    public tao<String, ErrorResult> getFeature(kdb kdbVar, p82 p82Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("60f78d80", new Object[]{this, kdbVar, p82Var});
        }
        try {
            Map<String, ? extends Object> map = p82Var.e;
            String str = p82Var.f25930a;
            String str2 = p82Var.b;
            String str3 = p82Var.c;
            boolean equals = Boolean.TRUE.equals(p82Var.d);
            BUFS.QueryArgs queryArgs = new BUFS.QueryArgs();
            if (map != null) {
                for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                    queryArgs.setQueryArgsKV(entry.getKey(), entry.getValue());
                }
            }
            return new tao().b(BUFS.getFeature(queryArgs, str, str2, str3, equals), null);
        } catch (Throwable th) {
            return new tao().b("", buildResult("502", th.getMessage()));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsBehaviXAbility
    public void trackScrollEnd(kdb kdbVar, z82 z82Var, jdb jdbVar) {
        List<l82> list;
        Double d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75d74cb5", new Object[]{this, kdbVar, z82Var, jdbVar});
            return;
        }
        try {
            if (!TextUtils.isEmpty(z82Var.f32599a) && (list = z82Var.d) != null && !list.isEmpty() && z82Var.c != null) {
                String str = z82Var.f32599a;
                ArrayList arrayList = new ArrayList();
                for (l82 l82Var : z82Var.d) {
                    BHXVisualCenterItem convertVisualItem = convertVisualItem(l82Var);
                    if (convertVisualItem != null) {
                        arrayList.add(convertVisualItem);
                    }
                }
                if (arrayList.isEmpty()) {
                    jdbVar.O(buildResult("401", "No items were successfully converted"));
                    return;
                }
                updateItemRect(arrayList, kdbVar.k());
                String str2 = z82Var.b;
                j82 j82Var = z82Var.c;
                if (j82Var == null || (d = j82Var.f21825a) == null || j82Var.b == null) {
                    jdbVar.O(buildResult("401", "currentOffset is null"));
                    return;
                }
                int intValue = d.intValue();
                int intValue2 = z82Var.c.b.intValue();
                HashMap hashMap = new HashMap();
                Map<String, ? extends Object> map = z82Var.e;
                if (map != null) {
                    for (String str3 : map.keySet()) {
                        hashMap.put(str3, ensureObjectToString(z82Var.e.get(str3)));
                    }
                }
                cqv.D(str, str2, intValue, intValue2, arrayList, hashMap);
                return;
            }
            jdbVar.O(buildResult("401", "Missing or invalid parameter"));
        } catch (Throwable th) {
            jdbVar.O(buildResult("502", th.getMessage()));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsBehaviXAbility
    public void trackScrollStart(kdb kdbVar, z82 z82Var, jdb jdbVar) {
        List<l82> list;
        Double d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b64920fc", new Object[]{this, kdbVar, z82Var, jdbVar});
            return;
        }
        try {
            if (!TextUtils.isEmpty(z82Var.f32599a) && (list = z82Var.d) != null && !list.isEmpty() && z82Var.c != null) {
                String str = z82Var.f32599a;
                ArrayList arrayList = new ArrayList();
                for (l82 l82Var : z82Var.d) {
                    BHXVisualCenterItem convertVisualItem = convertVisualItem(l82Var);
                    if (convertVisualItem != null) {
                        arrayList.add(convertVisualItem);
                    }
                }
                if (arrayList.isEmpty()) {
                    jdbVar.O(buildResult("401", "No items were successfully converted"));
                    return;
                }
                updateItemRect(arrayList, kdbVar.k());
                String str2 = z82Var.b;
                j82 j82Var = z82Var.c;
                if (j82Var == null || (d = j82Var.f21825a) == null || j82Var.b == null) {
                    jdbVar.O(buildResult("401", "currentOffset is null"));
                    return;
                }
                int intValue = d.intValue();
                int intValue2 = z82Var.c.b.intValue();
                HashMap hashMap = new HashMap();
                Map<String, ? extends Object> map = z82Var.e;
                if (map != null) {
                    for (String str3 : map.keySet()) {
                        hashMap.put(str3, ensureObjectToString(z82Var.e.get(str3)));
                    }
                }
                cqv.H(str, str2, intValue, intValue2, arrayList, hashMap);
                return;
            }
            jdbVar.O(buildResult("401", "Missing or invalid parameter"));
        } catch (Throwable th) {
            jdbVar.O(buildResult("502", th.getMessage()));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsBehaviXAbility
    public void trackScrolling(kdb kdbVar, z82 z82Var, jdb jdbVar) {
        List<l82> list;
        Double d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("589ace9c", new Object[]{this, kdbVar, z82Var, jdbVar});
            return;
        }
        try {
            if (!TextUtils.isEmpty(z82Var.f32599a) && (list = z82Var.d) != null && !list.isEmpty() && z82Var.c != null) {
                String str = z82Var.f32599a;
                ArrayList arrayList = new ArrayList();
                for (l82 l82Var : z82Var.d) {
                    BHXVisualCenterItem convertVisualItem = convertVisualItem(l82Var);
                    if (convertVisualItem != null) {
                        arrayList.add(convertVisualItem);
                    }
                }
                if (arrayList.isEmpty()) {
                    jdbVar.O(buildResult("401", "No items were successfully converted"));
                    return;
                }
                updateItemRect(arrayList, kdbVar.k());
                String str2 = z82Var.b;
                j82 j82Var = z82Var.c;
                if (j82Var == null || (d = j82Var.f21825a) == null || j82Var.b == null) {
                    jdbVar.O(buildResult("401", "currentOffset is null"));
                    return;
                }
                int intValue = d.intValue();
                int intValue2 = z82Var.c.b.intValue();
                HashMap hashMap = new HashMap();
                Map<String, ? extends Object> map = z82Var.e;
                if (map != null) {
                    for (String str3 : map.keySet()) {
                        hashMap.put(str3, ensureObjectToString(z82Var.e.get(str3)));
                    }
                }
                cqv.L(str, str2, intValue, intValue2, arrayList, hashMap);
                return;
            }
            jdbVar.O(buildResult("401", "Missing or invalid parameter"));
        } catch (Throwable th) {
            jdbVar.O(buildResult("502", th.getMessage()));
        }
    }

    private void updateItemPosition(List<BHXVisualCenterItem> list, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4275b1f5", new Object[]{this, list, view});
        } else if (view != null) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            for (BHXVisualCenterItem bHXVisualCenterItem : list) {
                om1 om1Var = bHXVisualCenterItem.b;
                float f3 = om1Var.b + f2 + (om1Var.d / 2.0f);
                float f4 = om1Var.f25484a + f + (om1Var.c / 2.0f);
                if (f3 < this.screenHeight / 2.0f) {
                    if (f4 < this.screenWidth / 2.0f) {
                        bHXVisualCenterItem.i = 1;
                    } else {
                        bHXVisualCenterItem.i = 2;
                    }
                } else if (f4 < this.screenWidth / 2.0f) {
                    bHXVisualCenterItem.i = 3;
                } else {
                    bHXVisualCenterItem.i = 4;
                }
            }
            TLog.logi("BehaviXAndroidAbility", "updateItemPosition");
        }
    }
}
