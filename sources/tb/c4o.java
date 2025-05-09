package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class c4o {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COLLECTION_ORDER = "collectionContentOrder";
    public static final String KEY_ASAC = "asac";
    public static final String KEY_BX_FEATURE = "bxFeature";
    public static final String KEY_CLOSE_WANNA_SEE = "closeWannaSee";
    public static final String KEY_CONTENT_PASSPARAMS = "contentPassParams";
    public static final String KEY_DATA_SOURCE = "dataSource";
    public static final String KEY_ENABLE_SERVER_ABR = "enableServerABR";
    public static final String KEY_FROMLAUNCHER = "fromLauncher";
    public static final String KEY_ISAUTOSLIDE = "isAutoSlide";
    public static final String KEY_ISGGPICKPRELOAD = "isGGPickPreload";
    public static final String KEY_ISSIMPLEPAGE = "isSimplePage";
    public static final String KEY_IS_PRELOAD_FILL = "isPreloadFill";
    public static final String KEY_LBS_DATA = "lbsData";
    public static final String KEY_NETWORK_SPEED = "networkSpeed";
    public static final String KEY_PAGE = "page";
    public static final String KEY_REFRESH_MODE = "refreshMode";
    public static final String KEY_REFRESH_TYPE = "refresh_type";
    public static final String KEY_SPM_URL = "spm-url";
    public static final String KEY_SWITCH_MODE = "switchMode";
    public static final String KEY_TAB3COMPONENTSOURCE = "tab3ComponentSource";
    public static final String KEY_VERTICAL_LAYOUT = "enableVerticalLayout";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Map f16858a = new HashMap();
        public final pep b;

        static {
            t2o.a(468714235);
        }

        public a(pep pepVar) {
            this.b = pepVar;
        }

        public Map a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("ce31e56a", new Object[]{this});
            }
            return this.f16858a;
        }

        public a b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2a946de1", new Object[]{this});
            }
            if (this.b == null) {
                return this;
            }
            ((HashMap) this.f16858a).put("spm-cnt", "a310p.13800399");
            ((HashMap) this.f16858a).put("spm-url", this.b.e);
            ((HashMap) this.f16858a).put("page", this.b.c);
            ((HashMap) this.f16858a).put("product_type", xau.PRODUCT_NAME);
            ((HashMap) this.f16858a).put("sourcePageName", this.b.k);
            HashMap hashMap = new HashMap();
            hashMap.put("sourcePageName", this.b.k);
            ((HashMap) this.f16858a).put("echoParam", hashMap);
            if (!TextUtils.isEmpty(this.b.g)) {
                ((HashMap) this.f16858a).put("detailParameters", this.b.g);
            }
            ((HashMap) this.f16858a).put("scene", this.b.l);
            ((HashMap) this.f16858a).put("miniAppId", this.b.m);
            if (!TextUtils.isEmpty(this.b.s)) {
                ((HashMap) this.f16858a).put(yj4.PARAM_UT_PARAMS, this.b.s);
            }
            ((HashMap) this.f16858a).put("tbvs_version", 31);
            Map map = this.f16858a;
            Boolean bool = Boolean.TRUE;
            ((HashMap) map).put(kf3.REQ_SUPPORTWEEX, bool);
            ((HashMap) this.f16858a).put(c4o.KEY_FROMLAUNCHER, Boolean.valueOf(e0o.e("video")));
            ((HashMap) this.f16858a).put(c4o.KEY_ISSIMPLEPAGE, Boolean.valueOf(e0o.g()));
            sj4.a(this.f16858a);
            ((HashMap) this.f16858a).put(c4o.KEY_ENABLE_SERVER_ABR, bool);
            ir9.b("RequestParam", "setLauncher islauncher=" + e0o.e("video") + ",issimple=" + e0o.g());
            return this;
        }

        public a c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("bc835943", new Object[]{this, new Boolean(z)});
            }
            if (z) {
                ((HashMap) this.f16858a).put(c4o.KEY_IS_PRELOAD_FILL, Boolean.TRUE);
            }
            return this;
        }

        public a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("bf68b53e", new Object[]{this, str});
            }
            if (str != null) {
                ((HashMap) this.f16858a).put("bxFeature", str);
            }
            return this;
        }

        public a e(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("52b3a342", new Object[]{this, new Boolean(z)});
            }
            if (z) {
                ((HashMap) this.f16858a).put(x96.REFRESH_TYPE, "edit");
            }
            return this;
        }

        public a f(Map map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a74ba854", new Object[]{this, map});
            }
            if (map != null) {
                ir9.b("RequestParam", "setExtendParams extendParams=" + map);
                ((HashMap) this.f16858a).putAll(map);
            }
            return this;
        }

        public a g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("74031c84", new Object[]{this, str});
            }
            if (str != null) {
                ((HashMap) this.f16858a).put(c4o.KEY_LBS_DATA, str);
            }
            return this;
        }

        public a h(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("12d1dc1e", new Object[]{this, new Boolean(z)});
            }
            if (z) {
                ((HashMap) this.f16858a).put("exclVinfo", "true");
            }
            return this;
        }

        public a i(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c67e96f9", new Object[]{this, new Integer(i)});
            }
            ir9.b("RequestParam", "request detail buildExtendParameters netSpeedValue=" + i);
            ((HashMap) this.f16858a).put(c4o.KEY_NETWORK_SPEED, i >= 0 ? Integer.valueOf(i) : null);
            return this;
        }

        public a j(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f3c1f57c", new Object[]{this, str});
            }
            if (str != null) {
                ((HashMap) this.f16858a).put(c4o.KEY_REFRESH_TYPE, str);
            }
            return this;
        }

        public a k(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ea1f7fc2", new Object[]{this, new Boolean(z)});
            }
            if (z) {
                ((HashMap) this.f16858a).put(c4o.KEY_ISGGPICKPRELOAD, "true");
            }
            return this;
        }
    }

    static {
        t2o.a(468714234);
    }

    public a a(pep pepVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("84c65c50", new Object[]{this, pepVar});
        }
        return new a(pepVar);
    }
}
