package androidx.fragment.app;

import android.view.View;
import androidx.collection.ArrayMap;
import androidx.core.app.SharedElementCallback;
import androidx.transition.FragmentTransitionSupport;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import tb.ckf;
import tb.i04;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\n\u001a\u0004\u0018\u00010\b*\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u000f\u001a\u00020\u000e*\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007¢\u0006\u0004\b\u000f\u0010\u0010JC\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\u00072\u0006\u0010\u0017\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001e\u001a\u00020\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0014H\u0007¢\u0006\u0004\b \u0010!R\u0016\u0010\"\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010#¨\u0006%"}, d2 = {"Landroidx/fragment/app/FragmentTransition;", "", "<init>", "()V", "Landroidx/fragment/app/FragmentTransitionImpl;", "resolveSupportImpl", "()Landroidx/fragment/app/FragmentTransitionImpl;", "Landroidx/collection/ArrayMap;", "", "value", "findKeyForValue", "(Landroidx/collection/ArrayMap;Ljava/lang/String;)Ljava/lang/String;", "Landroid/view/View;", "namedViews", "Ltb/xhv;", "retainValues", "(Landroidx/collection/ArrayMap;Landroidx/collection/ArrayMap;)V", "Landroidx/fragment/app/Fragment;", "inFragment", "outFragment", "", "isPop", "sharedElements", "isStart", "callSharedElementStartEnd", "(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;ZLandroidx/collection/ArrayMap;Z)V", "", "views", "", "visibility", "setViewVisibility", "(Ljava/util/List;I)V", "supportsTransition", "()Z", "PLATFORM_IMPL", "Landroidx/fragment/app/FragmentTransitionImpl;", "SUPPORT_IMPL", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class FragmentTransition {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final FragmentTransition INSTANCE;
    public static final FragmentTransitionImpl PLATFORM_IMPL = new FragmentTransitionCompat21();
    public static final FragmentTransitionImpl SUPPORT_IMPL;

    static {
        FragmentTransition fragmentTransition = new FragmentTransition();
        INSTANCE = fragmentTransition;
        SUPPORT_IMPL = fragmentTransition.resolveSupportImpl();
    }

    private FragmentTransition() {
    }

    @JvmStatic
    public static final void callSharedElementStartEnd(Fragment fragment, Fragment fragment2, boolean z, ArrayMap<String, View> arrayMap, boolean z2) {
        SharedElementCallback sharedElementCallback;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1dd8c48", new Object[]{fragment, fragment2, new Boolean(z), arrayMap, new Boolean(z2)});
            return;
        }
        ckf.g(fragment, "inFragment");
        ckf.g(fragment2, "outFragment");
        ckf.g(arrayMap, "sharedElements");
        if (z) {
            sharedElementCallback = fragment2.getEnterTransitionCallback();
        } else {
            sharedElementCallback = fragment.getEnterTransitionCallback();
        }
        if (sharedElementCallback != null) {
            ArrayList arrayList = new ArrayList(arrayMap.size());
            for (Map.Entry<String, View> entry : arrayMap.entrySet()) {
                arrayList.add(entry.getValue());
            }
            ArrayList arrayList2 = new ArrayList(arrayMap.size());
            for (Map.Entry<String, View> entry2 : arrayMap.entrySet()) {
                arrayList2.add(entry2.getKey());
            }
            if (z2) {
                sharedElementCallback.onSharedElementStart(arrayList2, arrayList, null);
            } else {
                sharedElementCallback.onSharedElementEnd(arrayList2, arrayList, null);
            }
        }
    }

    @JvmStatic
    public static final String findKeyForValue(ArrayMap<String, String> arrayMap, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ebbbc340", new Object[]{arrayMap, str});
        }
        ckf.g(arrayMap, "<this>");
        ckf.g(str, "value");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : arrayMap.entrySet()) {
            if (ckf.b(entry.getValue(), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            arrayList.add((String) entry2.getKey());
        }
        return (String) i04.c0(arrayList);
    }

    private final FragmentTransitionImpl resolveSupportImpl() {
        try {
            return (FragmentTransitionImpl) FragmentTransitionSupport.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    @JvmStatic
    public static final void setViewVisibility(List<? extends View> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83d36392", new Object[]{list, new Integer(i)});
            return;
        }
        ckf.g(list, "views");
        for (View view : list) {
            view.setVisibility(i);
        }
    }

    @JvmStatic
    public static final boolean supportsTransition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88a9cf04", new Object[0])).booleanValue();
        }
        if (PLATFORM_IMPL == null && SUPPORT_IMPL == null) {
            return false;
        }
        return true;
    }

    @JvmStatic
    public static final void retainValues(ArrayMap<String, String> arrayMap, ArrayMap<String, View> arrayMap2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f3eb310", new Object[]{arrayMap, arrayMap2});
            return;
        }
        ckf.g(arrayMap, "<this>");
        ckf.g(arrayMap2, "namedViews");
        for (int size = arrayMap.size() - 1; -1 < size; size--) {
            if (!arrayMap2.containsKey(arrayMap.valueAt(size))) {
                arrayMap.removeAt(size);
            }
        }
    }
}
