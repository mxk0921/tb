package com.taobao.search.searchdoor.activate;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.searchdoor.activate.hotspot.impl.HotSpotTabItemView;
import com.taobao.search.searchdoor.activate.hotspot.impl.HotSpotsItemView;
import com.taobao.taobao.R;
import tb.a07;
import tb.ckf;
import tb.o1p;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class ActivateViewLoader {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private static final int hotSpotPadding = o1p.a(9.0f);
    private static final int hotSpotHeight = o1p.a(37.0f);
    private static final int hotSpotHeight2024 = o1p.a(36.0f);
    private static final int hotSpotMarginBottom = o1p.a(6.0f);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815792965);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final HotSpotsItemView a(Context context, boolean z) {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HotSpotsItemView) ipChange.ipc$dispatch("55b4e5c", new Object[]{this, context, new Boolean(z)});
            }
            ckf.g(context, "context");
            HotSpotsItemView hotSpotsItemView = new HotSpotsItemView(context, z);
            hotSpotsItemView.setPadding(ActivateViewLoader.access$getHotSpotPadding$cp(), 0, 0, 0);
            if (z) {
                i = ActivateViewLoader.access$getHotSpotHeight2024$cp();
            } else {
                i = ActivateViewLoader.access$getHotSpotHeight$cp();
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, i);
            marginLayoutParams.bottomMargin = ActivateViewLoader.access$getHotSpotMarginBottom$cp();
            hotSpotsItemView.setLayoutParams(marginLayoutParams);
            return hotSpotsItemView;
        }

        public a() {
        }
    }

    static {
        t2o.a(815792964);
        t2o.a(815792934);
    }

    public static final /* synthetic */ int access$getHotSpotHeight$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b26a430b", new Object[0])).intValue();
        }
        return hotSpotHeight;
    }

    public static final /* synthetic */ int access$getHotSpotHeight2024$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b05b6e0b", new Object[0])).intValue();
        }
        return hotSpotHeight2024;
    }

    public static final /* synthetic */ int access$getHotSpotMarginBottom$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("49086139", new Object[0])).intValue();
        }
        return hotSpotMarginBottom;
    }

    public static final /* synthetic */ int access$getHotSpotPadding$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e04c0b3", new Object[0])).intValue();
        }
        return hotSpotPadding;
    }

    public View loadGuessView(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ded70b20", new Object[]{this, context, layoutInflater, viewGroup, new Boolean(z)});
        }
        ckf.g(context, "context");
        ckf.g(layoutInflater, "inflater");
        ckf.g(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.tbsearch_sf_guess_discovery, viewGroup, false);
        ckf.f(inflate, "inflate(...)");
        return inflate;
    }

    public View loadHotSpotItem(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f94873da", new Object[]{this, context, layoutInflater, viewGroup, new Boolean(z)});
        }
        ckf.g(context, "context");
        ckf.g(layoutInflater, "inflater");
        ckf.g(viewGroup, "container");
        return Companion.a(context, z);
    }

    public View loadHotSpotTab(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("701fec0a", new Object[]{this, context, layoutInflater, viewGroup, new Boolean(z)});
        }
        ckf.g(context, "context");
        ckf.g(layoutInflater, "inflater");
        ckf.g(viewGroup, "container");
        return new HotSpotTabItemView(context, z);
    }
}
