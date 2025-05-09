package tb;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Property;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class i1j {

    /* renamed from: a  reason: collision with root package name */
    public final SimpleArrayMap<String, j1j> f21041a = new SimpleArrayMap<>();
    public final SimpleArrayMap<String, PropertyValuesHolder[]> b = new SimpleArrayMap<>();

    public static void a(i1j i1jVar, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            i1jVar.l(objectAnimator.getPropertyName(), objectAnimator.getValues());
            i1jVar.m(objectAnimator.getPropertyName(), j1j.b(objectAnimator));
            return;
        }
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
    }

    public static i1j c(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return d(context, resourceId);
    }

    public static i1j d(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return e(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return e(arrayList);
        } catch (Exception unused) {
            new StringBuilder("Can't load animation resource ID #0x").append(Integer.toHexString(i));
            return null;
        }
    }

    public static i1j e(List<Animator> list) {
        i1j i1jVar = new i1j();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a(i1jVar, list.get(i));
        }
        return i1jVar;
    }

    public final PropertyValuesHolder[] b(PropertyValuesHolder[] propertyValuesHolderArr) {
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i = 0; i < propertyValuesHolderArr.length; i++) {
            propertyValuesHolderArr2[i] = propertyValuesHolderArr[i].clone();
        }
        return propertyValuesHolderArr2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1j)) {
            return false;
        }
        return this.f21041a.equals(((i1j) obj).f21041a);
    }

    public <T> ObjectAnimator f(String str, T t, Property<T, ?> property) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(t, g(str));
        ofPropertyValuesHolder.setProperty(property);
        h(str).a(ofPropertyValuesHolder);
        return ofPropertyValuesHolder;
    }

    public PropertyValuesHolder[] g(String str) {
        if (j(str)) {
            return b(this.b.get(str));
        }
        throw new IllegalArgumentException();
    }

    public j1j h(String str) {
        if (k(str)) {
            return this.f21041a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public int hashCode() {
        return this.f21041a.hashCode();
    }

    public long i() {
        SimpleArrayMap<String, j1j> simpleArrayMap = this.f21041a;
        int size = simpleArrayMap.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j1j valueAt = simpleArrayMap.valueAt(i);
            j = Math.max(j, valueAt.c() + valueAt.d());
        }
        return j;
    }

    public boolean j(String str) {
        if (this.b.get(str) != null) {
            return true;
        }
        return false;
    }

    public boolean k(String str) {
        if (this.f21041a.get(str) != null) {
            return true;
        }
        return false;
    }

    public void l(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.b.put(str, propertyValuesHolderArr);
    }

    public void m(String str, j1j j1jVar) {
        this.f21041a.put(str, j1jVar);
    }

    public String toString() {
        return "\n" + i1j.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f21041a + "}\n";
    }
}
