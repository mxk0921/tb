package com.taobao.android.dinamicx_v4.responsive.impl;

import android.text.TextUtils;
import androidx.constraintlayout.motion.widget.Key;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.model.DXLongSparseArray;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class PropertyInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final DXLongSparseArray<String> d = new DXLongSparseArray() { // from class: com.taobao.android.dinamicx_v4.responsive.impl.PropertyInfo.1
        {
            put(16887479372907L, "alpha");
            put(9346582897824575L, "height");
            put(DXWidgetNode.DXVIEW_SCALEX, "scaleX");
            put(DXWidgetNode.DXVIEW_SCALEY, "scaleY");
            put(DXWidgetNode.DXVIEW_TRANSLATIONX, "translationX");
            put(DXWidgetNode.DXVIEW_TRANSLATIONY, "translationY");
            put(DXWidgetNode.DXVIEW_ROTATIONX, "rotationX");
            put(DXWidgetNode.DXVIEW_ROTATIONY, "rotationY");
            put(DXWidgetNode.DXVIEW_ROTATIONZ, Key.ROTATION);
        }
    };
    public static final HashMap<String, Long> e = new HashMap<String, Long>() { // from class: com.taobao.android.dinamicx_v4.responsive.impl.PropertyInfo.2
        {
            put("alpha", 16887479372907L);
            put("height", 9346582897824575L);
            put("scaleX", Long.valueOf((long) DXWidgetNode.DXVIEW_SCALEX));
            put("scaleY", Long.valueOf((long) DXWidgetNode.DXVIEW_SCALEY));
            put("translationX", Long.valueOf((long) DXWidgetNode.DXVIEW_TRANSLATIONX));
            put("translationY", Long.valueOf((long) DXWidgetNode.DXVIEW_TRANSLATIONY));
            put("rotationX", Long.valueOf((long) DXWidgetNode.DXVIEW_ROTATIONX));
            put("rotationY", Long.valueOf((long) DXWidgetNode.DXVIEW_ROTATIONY));
            put(Key.ROTATION, Long.valueOf((long) DXWidgetNode.DXVIEW_ROTATIONZ));
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<DXWidgetNode> f7548a;
    public Set<Long> b;
    public Set<String> c;

    static {
        t2o.a(444597878);
    }

    public static Long b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("cb840e6", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return e.get(str);
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f4839d9", new Object[]{this, new Long(j)});
            return;
        }
        if (this.b == null) {
            this.b = new HashSet();
            this.c = new HashSet();
        }
        ((HashSet) this.b).add(Long.valueOf(j));
        ((HashSet) this.c).add(d.get(j));
    }

    public WeakReference<DXWidgetNode> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("a0aba74d", new Object[]{this});
        }
        return this.f7548a;
    }

    public Collection<String> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("818c1e83", new Object[]{this});
        }
        return this.c;
    }

    public void e(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f208684", new Object[]{this, dXWidgetNode});
        } else {
            this.f7548a = new WeakReference<>(dXWidgetNode);
        }
    }
}
