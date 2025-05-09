package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class vrp {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_ALBUM_DETAIL = "album_detail";
    public static final String BIZ_BG_INTERACT = "bg_interact";
    public static final String BIZ_COMMENT_LIST = "commentlist";
    public static final String BIZ_DEBUG = "debug";
    public static final String BIZ_GOODS_LIST = "goodslist";
    public static final String BIZ_INTERACT = "interact";
    public static final String BIZ_OPEN_INTERACT = "open_interact";
    public static final String BIZ_SHORTVIDEO_CARD = "shortvideo_card";
    public static final String BIZ_SHORTVIDEO_GLOBAL = "shortvideo_global";
    public static final String BIZ_SHORTVIDEO_GLOBAL_DX = "shortvideo_global_dx";
    public static final String BIZ_SHORTVIDEO_GLOBAL_FLOAT = "shortvideo_global_float";
    public static final String BIZ_SHORTVIDEO_GLOBAL_H5 = "shortvideo_global_h5";
    public static final String BIZ_TNODE_HOME = "tnode_home";
    public static final String FROM_GG_HOME = "gg_home";
    public static final String FROM_NATIVE = "native";
    public static final String FROM_TNODE = "tnode";
    public static final String FROM_WEEX = "weex";
    public static final String KEY_ARGS = "args";
    public static final String KEY_ARGS_SIZE = "argsSize";
    public static final String KEY_BIZ_SCENE = "bizscene";
    public static final String KEY_CALLBACK = "callback";
    public static final String KEY_FROM = "from";
    public static final String KEY_ID = "id";
    public static final String KEY_NAME = "name";
    public static final String KEY_TARGET = "target";
    public static final String KEY_TIMESTAMP = "timestamp";
    public static final String MSG_DATA_CHANGE = "VSMSG_updateMediaData";
    public static final String MSG_HIDE_TABBAR = "VSMSG_ShowBackAndHideBottomTabbar";
    public static final String MSG_SHOW_TABBAR = "VSMSG_HideBackAndShowBottomTabbar";
    public static final String MSG_UPDATE_ALBUM_DETAIL = "VSMSG_updateAlbumDetail";

    /* renamed from: a  reason: collision with root package name */
    public final String f30209a;
    public final String b;
    public final String c;
    public final String d;
    public final Object e;
    public final long f;
    public final a g;
    public Map h;

    static {
        t2o.a(469762062);
    }

    public vrp(String str, String str2, Map map) {
        this(BIZ_SHORTVIDEO_CARD, "native", str, str2, null, map, null);
    }

    public Map a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(KEY_BIZ_SCENE, this.f30209a);
        hashMap.put("from", this.b);
        hashMap.put("name", this.c);
        hashMap.put("id", this.d);
        Object obj = this.e;
        if (obj != null) {
            hashMap.put("target", obj);
        }
        hashMap.put("args", this.h);
        hashMap.put("timestamp", Long.valueOf(this.f));
        hashMap.put(FluidSDK.FLUID_SDK_FLAG, "1");
        return hashMap;
    }

    public Map b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9e944acb", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(KEY_BIZ_SCENE, this.f30209a);
        hashMap.put("from", this.b);
        hashMap.put("name", this.c);
        hashMap.put("id", this.d);
        Object obj = this.e;
        if (obj != null) {
            hashMap.put("target", obj);
        }
        hashMap.put("timestamp", Long.valueOf(this.f));
        hashMap.put(FluidSDK.FLUID_SDK_FLAG, "1");
        return hashMap;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.c + "_" + this.f30209a + "_" + this.b + "_" + this.d + "_" + this.f + "_isFluidSDK_";
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static abstract class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public lr9 f30210a;
        public vrp b;

        static {
            t2o.a(469762063);
        }

        public static /* synthetic */ vrp a(a aVar, vrp vrpVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (vrp) ipChange.ipc$dispatch("7a166c8f", new Object[]{aVar, vrpVar});
            }
            aVar.b = vrpVar;
            return vrpVar;
        }

        public boolean b(lr9 lr9Var, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("399391c5", new Object[]{this, lr9Var, obj})).booleanValue();
            }
            if (this.f30210a == null) {
                this.f30210a = lr9Var;
                return true;
            }
            ir9.b("MessageCenter", "sendMessage: " + ("Callback消息已经被" + this.f30210a.getClass().getSimpleName() + "处理, 忽略当前Handler: " + lr9Var.getClass().getSimpleName() + " Message:" + this.b));
            return false;
        }
    }

    public vrp(String str, String str2, Map map, a aVar) {
        this(BIZ_SHORTVIDEO_CARD, "native", str, str2, null, map, aVar);
    }

    public vrp(String str, String str2, String str3, String str4, Object obj, Map map, a aVar) {
        this.f30209a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = obj;
        if (str3.equals(MSG_DATA_CHANGE) || str3.equals(MSG_UPDATE_ALBUM_DETAIL)) {
            this.h = map;
        } else if (map != null) {
            this.h = new HashMap(map);
        } else {
            this.h = null;
        }
        this.f = System.currentTimeMillis();
        this.g = aVar;
        if (aVar != null) {
            a.a(aVar, this);
        }
    }

    public vrp(Map map, a aVar) {
        this.f30209a = nwv.I(map.get(KEY_BIZ_SCENE), null);
        this.b = nwv.I(map.get("from"), null);
        this.c = nwv.I(map.get("name"), null);
        this.d = nwv.I(map.get("id"), null);
        this.e = map.get("target");
        Object obj = map.get("args");
        if (obj == null) {
            this.h = null;
        } else if (obj instanceof Map) {
            this.h = (Map) obj;
        } else {
            this.h = JSON.parseObject(obj.toString());
        }
        this.f = nwv.y(map.get("timestamp"), 0L);
        this.g = aVar;
        if (aVar != null) {
            a.a(aVar, this);
        }
    }
}
