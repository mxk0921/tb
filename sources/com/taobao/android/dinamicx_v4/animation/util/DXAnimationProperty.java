package com.taobao.android.dinamicx_v4.animation.util;

import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.HashMap;
import java.util.Map;
import tb.kl6;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class DXAnimationProperty<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f7544a;
    public final Property<View, T> b;
    public final FloatPropertyCompat<View> c;
    public static final DXAnimationProperty<Float> ALPHA = new a(1, View.ALPHA, DynamicAnimation.ALPHA);
    public static final DXAnimationProperty<Float> SCALE_X = new b(8, View.SCALE_X, DynamicAnimation.SCALE_X);
    public static final DXAnimationProperty<Float> SCALE_Y = new c(16, View.SCALE_Y, DynamicAnimation.SCALE_Y);
    public static final DXAnimationProperty<Float> TRANSLATION_X = new d(32, View.TRANSLATION_X, DynamicAnimation.TRANSLATION_X);
    public static final DXAnimationProperty<Float> TRANSLATION_Y = new e(64, View.TRANSLATION_Y, DynamicAnimation.TRANSLATION_Y);
    public static final DXAnimationProperty<Float> ROTATION_X = new f(256, View.ROTATION_X, DynamicAnimation.ROTATION_X);
    public static final DXAnimationProperty<Float> ROTATION_Y = new g(512, View.ROTATION_Y, DynamicAnimation.ROTATION_Y);
    public static final DXAnimationProperty<Float> ROTATION_Z = new h(1024, View.ROTATION, DynamicAnimation.ROTATION);
    public static final Map<String, DXAnimationProperty> sProperties = new HashMap<String, DXAnimationProperty>() { // from class: com.taobao.android.dinamicx_v4.animation.util.DXAnimationProperty.9
        {
            DXAnimationProperty<Float> dXAnimationProperty = DXAnimationProperty.ALPHA;
            put(dXAnimationProperty.d(), dXAnimationProperty);
            DXAnimationProperty<Float> dXAnimationProperty2 = DXAnimationProperty.SCALE_X;
            put(dXAnimationProperty2.d(), dXAnimationProperty2);
            DXAnimationProperty<Float> dXAnimationProperty3 = DXAnimationProperty.SCALE_Y;
            put(dXAnimationProperty3.d(), dXAnimationProperty3);
            DXAnimationProperty<Float> dXAnimationProperty4 = DXAnimationProperty.TRANSLATION_X;
            put(dXAnimationProperty4.d(), dXAnimationProperty4);
            DXAnimationProperty<Float> dXAnimationProperty5 = DXAnimationProperty.TRANSLATION_Y;
            put(dXAnimationProperty5.d(), dXAnimationProperty5);
            DXAnimationProperty<Float> dXAnimationProperty6 = DXAnimationProperty.ROTATION_X;
            put(dXAnimationProperty6.d(), dXAnimationProperty6);
            DXAnimationProperty<Float> dXAnimationProperty7 = DXAnimationProperty.ROTATION_Y;
            put(dXAnimationProperty7.d(), dXAnimationProperty7);
            DXAnimationProperty<Float> dXAnimationProperty8 = DXAnimationProperty.ROTATION_Z;
            put(dXAnimationProperty8.d(), dXAnimationProperty8);
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a extends DXAnimationProperty<Float> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(int i, Property property, FloatPropertyCompat floatPropertyCompat) {
            super(i, property, floatPropertyCompat);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx_v4/animation/util/DXAnimationProperty$1");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b extends DXAnimationProperty<Float> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(int i, Property property, FloatPropertyCompat floatPropertyCompat) {
            super(i, property, floatPropertyCompat);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx_v4/animation/util/DXAnimationProperty$2");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c extends DXAnimationProperty<Float> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(int i, Property property, FloatPropertyCompat floatPropertyCompat) {
            super(i, property, floatPropertyCompat);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx_v4/animation/util/DXAnimationProperty$3");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class d extends DXAnimationProperty<Float> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(int i, Property property, FloatPropertyCompat floatPropertyCompat) {
            super(i, property, floatPropertyCompat);
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx_v4/animation/util/DXAnimationProperty$4");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class e extends DXAnimationProperty<Float> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e(int i, Property property, FloatPropertyCompat floatPropertyCompat) {
            super(i, property, floatPropertyCompat);
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx_v4/animation/util/DXAnimationProperty$5");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class f extends DXAnimationProperty<Float> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f(int i, Property property, FloatPropertyCompat floatPropertyCompat) {
            super(i, property, floatPropertyCompat);
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx_v4/animation/util/DXAnimationProperty$6");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class g extends DXAnimationProperty<Float> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g(int i, Property property, FloatPropertyCompat floatPropertyCompat) {
            super(i, property, floatPropertyCompat);
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx_v4/animation/util/DXAnimationProperty$7");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class h extends DXAnimationProperty<Float> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h(int i, Property property, FloatPropertyCompat floatPropertyCompat) {
            super(i, property, floatPropertyCompat);
        }

        public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx_v4/animation/util/DXAnimationProperty$8");
        }
    }

    static {
        t2o.a(444597759);
    }

    public DXAnimationProperty(int i, Property<View, T> property, FloatPropertyCompat<View> floatPropertyCompat) {
        this.f7544a = i;
        this.b = property;
        this.c = floatPropertyCompat;
    }

    public static DXAnimationProperty b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXAnimationProperty) ipChange.ipc$dispatch("4616db87", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return sProperties.get(str);
    }

    public static <T> DXAnimationProperty<T> c(String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXAnimationProperty) ipChange.ipc$dispatch("396e3316", new Object[]{str, cls});
        }
        DXAnimationProperty<T> b2 = b(str);
        if (b2 == null || b2.e() != cls) {
            return null;
        }
        return b2;
    }

    public void a(View view, boolean z) {
        DXWidgetNode referenceNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae811689", new Object[]{this, view, new Boolean(z)});
            return;
        }
        DXWidgetNode b2 = kl6.b(view);
        if (!(b2 instanceof DXWidgetNode) || (referenceNode = b2.getReferenceNode()) == null) {
            return;
        }
        if (z) {
            referenceNode.unsetStatAnimationFlag(this.f7544a);
        } else {
            referenceNode.setStatAnimationFlag(this.f7544a);
        }
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.b.getName();
    }

    public Class<T> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("dc9c66e4", new Object[]{this});
        }
        return this.b.getType();
    }
}
