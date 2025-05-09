package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class r73 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String EVENT_CHANGE_SCENE = "change_scene";
    public static final String EVENT_CLICK_ALBUM = "click_album";
    public static final String EVENT_CLICK_HISTORY = "click_history";
    public static final String EVENT_CLICK_OUTER_ALBUM = "click_outer_album";
    public static final String EVENT_FLIP_CAMERA = "flip_camera";
    public static final String EVENT_OPERATE_FLASH_LIGHT = "operate_flash_light";
    public static final String EVENT_SHOW_CODE_ANCHOR_VIEW = "show_code_anchor_view";
    public static final String EVENT_TAKE_PHOTO = "take_photo";

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, List<v9e>> f27158a = new LinkedHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        static {
            t2o.a(481296760);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(481296759);
    }

    public final void a(String str, Object obj) {
        List<v9e> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd4ef407", new Object[]{this, str, obj});
        } else if (str != null && str.length() != 0 && (list = (List) ((LinkedHashMap) this.f27158a).get(str)) != null) {
            for (v9e v9eVar : list) {
                v9eVar.q(str, obj);
            }
        }
    }

    public final void b(String str, v9e v9eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("221a0a43", new Object[]{this, str, v9eVar});
        } else if (str != null && str.length() != 0 && v9eVar != null) {
            List<v9e> list = (List) ((LinkedHashMap) this.f27158a).get(str);
            if (list == null) {
                list = new ArrayList<>();
            }
            list.add(v9eVar);
            this.f27158a.put(str, list);
        }
    }
}
