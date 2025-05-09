package com.taobao.trade.uikit.feature.utils;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.trade.uikit.feature.features.FeatureFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import tb.hv;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class FeatureList<T extends View> extends ArrayList<hv<? super T>> implements Comparator<hv<? super T>> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 5539018560951385305L;
    private T mHost;

    static {
        t2o.a(724566094);
        t2o.a(724566095);
    }

    public FeatureList(T t) {
        this.mHost = t;
    }

    public static /* synthetic */ Object ipc$super(FeatureList featureList, String str, Object... objArr) {
        if (str.hashCode() == 195222152) {
            return new Boolean(super.add((FeatureList) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trade/uikit/feature/utils/FeatureList");
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return add((hv) ((hv) obj));
    }

    public boolean addFeature(hv<? super T> hvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86bfac9d", new Object[]{this, hvVar})).booleanValue();
        }
        if (hvVar == null) {
            return false;
        }
        hvVar.setHost(this.mHost);
        return add((hv) hvVar);
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
        return compare((hv) ((hv) obj), (hv) ((hv) obj2));
    }

    public hv<? super T> findFeature(Class<? extends hv<? super T>> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hv) ipChange.ipc$dispatch("265698fa", new Object[]{this, cls});
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            hv<? super T> hvVar = (hv) get(i);
            if (hvVar.getClass() == cls) {
                return hvVar;
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.TradeFeatureNameSpace);
        if (obtainStyledAttributes != null) {
            ArrayList creator = FeatureFactory.creator(this.mHost.getContext(), obtainStyledAttributes);
            int size = creator.size();
            for (int i2 = 0; i2 < size; i2++) {
                hv<? super T> hvVar = (hv) creator.get(i2);
                addFeature(hvVar);
                hvVar.constructor(context, attributeSet, i);
            }
            obtainStyledAttributes.recycle();
        }
    }

    public boolean removeFeature(Class<? extends hv<? super T>> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9158b08", new Object[]{this, cls})).booleanValue();
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            hv hvVar = get(i);
            if (hvVar.getClass() == cls) {
                return remove(hvVar);
            }
        }
        return false;
    }

    public boolean add(hv<? super T> hvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef233e29", new Object[]{this, hvVar})).booleanValue();
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            hv hvVar2 = get(i);
            if (TextUtils.equals(hvVar2.getClass().getName(), hvVar.getClass().getName())) {
                throw new RuntimeException(hvVar2.getClass().getName().concat(" already add to this view"));
            }
        }
        boolean add = super.add((FeatureList<T>) hvVar);
        Collections.sort(this, this);
        return add;
    }

    public int compare(hv<? super T> hvVar, hv<? super T> hvVar2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f80c3159", new Object[]{this, hvVar, hvVar2})).intValue() : FeatureFactory.getFeaturePriority(hvVar.getClass().getSimpleName()) - FeatureFactory.getFeaturePriority(hvVar2.getClass().getSimpleName());
    }
}
