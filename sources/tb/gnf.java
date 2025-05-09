package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class gnf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String EVENT_IDENTIFY_PROBLEM_UPDATE = "identify_problem_update";
    public static final String EVENT_IDENTIFY_REGION_SELECTED = "identify_region_selected";
    public static final String EVENT_IDENTIFY_REGION_UPDATE = "identify_region_update";
    public static final String EVENT_KEYBOARD_HEIGHT_CHANGE = "keyboard_height_change";
    public static final String EVENT_LOADING_STATE_OPERATE = "loading_state_operate";
    public static final String EVENT_PREVIEW_BITMAP_UPDATE = "preview_bitmap_update";
    public static final String EVENT_UI_CONTAINER_LOADED = "ui_container_loaded";

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f20109a = new LinkedHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        static {
            t2o.a(481296989);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(481296988);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            ((LinkedHashMap) this.f20109a).clear();
        }
    }

    public final void b(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd4ef407", new Object[]{this, str, obj});
        } else if (str != null && str.length() != 0) {
            Object obj2 = ((LinkedHashMap) this.f20109a).get(str);
            if (obj2 instanceof v9e) {
                ((v9e) obj2).q(str, obj);
            } else if (kqu.l(obj2)) {
                if (obj2 != null) {
                    for (v9e v9eVar : kqu.c(obj2)) {
                        v9eVar.q(str, obj);
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableList<com.etao.feimagesearch.struct.IViewEventObserver>");
            }
        }
    }

    public final void c(String str, v9e v9eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("221a0a43", new Object[]{this, str, v9eVar});
        } else if (str != null && str.length() != 0 && v9eVar != null) {
            Object obj = ((LinkedHashMap) this.f20109a).get(str);
            if (obj instanceof v9e) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(obj);
                arrayList.add(v9eVar);
                this.f20109a.put(str, arrayList);
            } else if (!kqu.l(obj)) {
                this.f20109a.put(str, v9eVar);
            } else if (obj != null) {
                kqu.c(obj).add(v9eVar);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableList<com.etao.feimagesearch.struct.IViewEventObserver>");
            }
        }
    }
}
