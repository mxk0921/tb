package com.taobao.themis.pub_kit.widget;

import android.graphics.Color;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface IActionViewTheme {
    public static final a Companion = a.$$INSTANCE;
    public static final float STOKE_WIDTH = 0.6f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/pub_kit/widget/IActionViewTheme$Theme;", "", "(Ljava/lang/String;I)V", "LIGHT", "DARK", "themis_pub_kit_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class Theme extends Enum<Theme> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final Theme LIGHT = new Theme("LIGHT", 0);
        public static final Theme DARK = new Theme("DARK", 1);
        private static final /* synthetic */ Theme[] $VALUES = $values();

        private static final /* synthetic */ Theme[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Theme[]) ipChange.ipc$dispatch("c16c6391", new Object[0]) : new Theme[]{LIGHT, DARK};
        }

        private Theme(String str, int i) {
        }

        public static /* synthetic */ Object ipc$super(Theme theme, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/pub_kit/widget/IActionViewTheme$Theme");
        }

        public static Theme valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("78365986", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(Theme.class, str);
            }
            return (Theme) valueOf;
        }

        public static Theme[] values() {
            Object clone;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                clone = ipChange.ipc$dispatch("c1f4e635", new Object[0]);
            } else {
                clone = $VALUES.clone();
            }
            return (Theme[]) clone;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final float STOKE_WIDTH = 0.6f;
        public static final /* synthetic */ a $$INSTANCE = new a();

        /* renamed from: a  reason: collision with root package name */
        public static final int f13746a = Color.parseColor("#FF11192D");
        public static final int b = Color.parseColor("#33FFFFFF");
        public static final int c = Color.parseColor("#240E1119");
        public static final int d = Color.parseColor("#240E1119");
        public static final int e = Color.parseColor("#FFFFFFFF");
        public static final int f = Color.parseColor("#330E1119");
        public static final int g = Color.parseColor("#1AFFFFFF");
        public static final int h = Color.parseColor("#FFE5E8EC");

        static {
            t2o.a(845152400);
        }

        public final int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ea3bb110", new Object[]{this})).intValue();
            }
            return b;
        }

        public final int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f57e6a50", new Object[]{this})).intValue();
            }
            return f;
        }

        public final int c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5cf1882f", new Object[]{this})).intValue();
            }
            return c;
        }

        public final int d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d9837711", new Object[]{this})).intValue();
            }
            return g;
        }

        public final int e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5f6adf48", new Object[]{this})).intValue();
            }
            return d;
        }

        public final int f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("26350318", new Object[]{this})).intValue();
            }
            return h;
        }

        public final int g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("eaa8e3dc", new Object[]{this})).intValue();
            }
            return f13746a;
        }

        public final int h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2b79104", new Object[]{this})).intValue();
            }
            return e;
        }
    }
}
