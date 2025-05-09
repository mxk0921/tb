package com.taobao.android.detail.ttdetail.widget.listview.feature.features;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import tb.c49;
import tb.iv;
import tb.t2o;
import tb.tgh;
import tb.tq4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class FeatureList<T extends View> extends ArrayList<iv<? super T>> implements Comparator<iv<? super T>> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "FeatureList";
    private static final long serialVersionUID = 5539018560951385305L;
    private T mHost;

    static {
        t2o.a(912263040);
        t2o.a(912263041);
    }

    public FeatureList(T t) {
        this.mHost = t;
    }

    public static /* synthetic */ Object ipc$super(FeatureList featureList, String str, Object... objArr) {
        if (str.hashCode() == 195222152) {
            return new Boolean(super.add((FeatureList) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/listview/feature/features/FeatureList");
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return add((iv) ((iv) obj));
    }

    public boolean addFeature(iv<? super T> ivVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81a2b746", new Object[]{this, ivVar})).booleanValue();
        }
        if (ivVar == null) {
            return false;
        }
        ivVar.b(this.mHost);
        return add((iv) ivVar);
    }

    public void clearFeatures() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed050131", new Object[]{this});
            return;
        }
        clear();
        this.mHost.requestLayout();
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return compare((iv) ((iv) obj), (iv) ((iv) obj2));
    }

    public iv<? super T> findFeature(Class<? extends iv<? super T>> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iv) ipChange.ipc$dispatch("c2a88e3", new Object[]{this, cls});
        }
        Iterator<iv<? super T>> it = iterator();
        while (it.hasNext()) {
            iv<? super T> ivVar = (iv) it.next();
            if (ivVar.getClass() == cls) {
                return ivVar;
            }
        }
        return null;
    }

    public void init(Context context, AttributeSet attributeSet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa26a346", new Object[]{this, context, attributeSet, new Integer(i)});
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.TTDetailExt_FeatureNameSpace);
        if (obtainStyledAttributes != null) {
            try {
                Iterator it = c49.a(tq4.d(this.mHost), obtainStyledAttributes).iterator();
                while (it.hasNext()) {
                    iv<? super T> ivVar = (iv) it.next();
                    addFeature(ivVar);
                    ivVar.a(context, attributeSet, i);
                }
                obtainStyledAttributes.recycle();
            } catch (Throwable th) {
                tgh.b(TAG, "FeatureList init error:" + th);
            }
        }
    }

    public boolean removeFeature(Class<? extends iv<? super T>> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9158b08", new Object[]{this, cls})).booleanValue();
        }
        Iterator<iv<? super T>> it = iterator();
        while (it.hasNext()) {
            iv ivVar = (iv) it.next();
            if (ivVar.getClass() == cls) {
                return remove(ivVar);
            }
        }
        return false;
    }

    public boolean add(iv<? super T> ivVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1fa3bed2", new Object[]{this, ivVar})).booleanValue();
        }
        Iterator<iv<? super T>> it = iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(((iv) it.next()).getClass().getName(), ivVar.getClass().getName())) {
                throw new RuntimeException(iv.class.getName().concat(" already add to this view"));
            }
        }
        boolean add = super.add((FeatureList<T>) ivVar);
        Collections.sort(this, this);
        return add;
    }

    public int compare(iv<? super T> ivVar, iv<? super T> ivVar2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("940e2f2b", new Object[]{this, ivVar, ivVar2})).intValue() : c49.b(ivVar.getClass().getSimpleName()) - c49.b(ivVar2.getClass().getSimpleName());
    }
}
