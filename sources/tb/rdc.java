package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface rdc {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String BACK_HOME_LOCATION = "backHomeLocation";
        public static final String DEFAULT_SECTION_BIZ_CODE = "defaultIconSectionBIzCode";
        public static final String ICON_ANIME_DURATION = "IconAnimeDuration";
        public static final String ICON_ANIME_PARENT_IMG = "IconAnimeParentImg";
        public static final String ICON_CONTAINER_SECTION_BIZ_CODE = "iconContainerBizCode";
        public static final String IS_LIGHTING_ICON_ANIME = "isLightingIconAnime";
        public static final String IS_OUT_LINK_BACK_GUIDE_ANIME = "isOutLinkBackGuideAnime";
        public static final String LOCATION_ALL_CHANNEL = "allChannel";
        public static final String LOCATION_ICON = "icon";
        public static final String LOCATION_REPLACE = "guideReplaceMiniAppId";
        public static final String TARGET_MINI_APP_ID = "targetIconSectionBIzCode";

        /* renamed from: a  reason: collision with root package name */
        public String f27294a;
        public String b;
        public String c;
        public String d;
        public long e = 2500;
        public boolean f;
        public boolean g;
        public String h;

        static {
            t2o.a(491782379);
        }

        public static a m(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9f0bbf9", new Object[]{jSONObject});
            }
            if (!a(jSONObject)) {
                return null;
            }
            a aVar = new a();
            aVar.q(jSONObject.getString(ICON_CONTAINER_SECTION_BIZ_CODE));
            aVar.o(jSONObject.getString(DEFAULT_SECTION_BIZ_CODE));
            aVar.u(jSONObject.getString(TARGET_MINI_APP_ID));
            aVar.r(jSONObject.getString(ICON_ANIME_PARENT_IMG));
            aVar.s(jSONObject.getBooleanValue(IS_LIGHTING_ICON_ANIME));
            aVar.t(jSONObject.getBooleanValue(IS_OUT_LINK_BACK_GUIDE_ANIME));
            aVar.n(jSONObject.getString(BACK_HOME_LOCATION));
            if (jSONObject.containsKey(ICON_ANIME_DURATION)) {
                if (jSONObject.getLongValue(ICON_ANIME_DURATION) > 0) {
                    aVar.p(jSONObject.getLongValue(ICON_ANIME_DURATION));
                } else {
                    fve.e("AnimeConfig", "Illegal duration:" + aVar.c());
                }
            }
            return aVar;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("546730d3", new Object[]{this});
            }
            return this.c;
        }

        public long c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ed837a85", new Object[]{this})).longValue();
            }
            return this.e;
        }

        public String d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b9893ecb", new Object[]{this});
            }
            return this.f27294a;
        }

        public String e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("c6c77d50", new Object[]{this});
            }
            return this.d;
        }

        public String f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("73cca57b", new Object[]{this});
            }
            return this.b;
        }

        public boolean g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d74e6373", new Object[]{this})).booleanValue();
            }
            return TextUtils.equals(this.h, LOCATION_ALL_CHANNEL);
        }

        public boolean i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e8cbd790", new Object[]{this})).booleanValue();
            }
            if (TextUtils.equals(this.h, LOCATION_ALL_CHANNEL) || TextUtils.equals(this.h, "icon") || TextUtils.equals(this.h, LOCATION_REPLACE)) {
                return true;
            }
            return false;
        }

        public boolean j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("252c7d0", new Object[]{this})).booleanValue();
            }
            return this.f;
        }

        public boolean k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a00660a8", new Object[]{this})).booleanValue();
            }
            return this.g;
        }

        public boolean l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("12ff14eb", new Object[]{this})).booleanValue();
            }
            if (TextUtils.isEmpty(this.b) || TextUtils.isEmpty(this.f27294a) || TextUtils.isEmpty(this.c) || TextUtils.isEmpty(this.d) || this.e <= 0) {
                return false;
            }
            return true;
        }

        public void n(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("18933b8e", new Object[]{this, str});
            } else {
                this.h = str;
            }
        }

        public void o(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8eda176b", new Object[]{this, str});
            } else {
                this.c = str;
            }
        }

        public void p(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("55c2b4c7", new Object[]{this, new Long(j)});
            } else {
                this.e = j;
            }
        }

        public void q(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5be8430b", new Object[]{this, str});
            } else {
                this.f27294a = str;
            }
        }

        public void r(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8911b426", new Object[]{this, str});
            } else {
                this.d = str;
            }
        }

        public void s(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e4d9c0", new Object[]{this, new Boolean(z)});
            } else {
                this.f = z;
            }
        }

        public void t(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65b6ffe8", new Object[]{this, new Boolean(z)});
            } else {
                this.g = z;
            }
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "AnimeConfig{iconContainerBizCode=" + this.f27294a + ", targetMiniAppId='" + this.b + "', defaultSectionBizCode='" + this.c + "', imgSession='" + this.d + "', duration=" + this.e + "', isLightingIconAnime=" + this.f + "', isOutLinkBackGuideAnime=" + this.g + ", backHomeLocation=" + this.h + '}';
        }

        public void u(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bfefdec3", new Object[]{this, str});
            } else {
                this.b = str;
            }
        }

        public static boolean a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5850eac1", new Object[]{jSONObject})).booleanValue();
            }
            return jSONObject != null && jSONObject.containsKey(TARGET_MINI_APP_ID) && jSONObject.containsKey(ICON_CONTAINER_SECTION_BIZ_CODE) && jSONObject.containsKey(DEFAULT_SECTION_BIZ_CODE);
        }

        public static boolean h(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ea3c6397", new Object[]{str})).booleanValue();
            }
            return !TextUtils.isEmpty(str) && str.contains(TARGET_MINI_APP_ID) && str.contains(ICON_CONTAINER_SECTION_BIZ_CODE) && str.contains(DEFAULT_SECTION_BIZ_CODE);
        }
    }
}
