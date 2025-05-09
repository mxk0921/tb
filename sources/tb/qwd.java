package tb;

import com.taobao.themis.kernel.ability.register.AbilityType;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface qwd {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements e {
        static {
            t2o.a(839909710);
            t2o.a(839909714);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b implements e {

        /* renamed from: a  reason: collision with root package name */
        public final AbilityType f26968a;
        public final Class<? extends j8s> b;

        static {
            t2o.a(839909711);
            t2o.a(839909714);
        }

        public b(Class<? extends j8s> cls, AbilityType abilityType) {
            this.f26968a = abilityType;
            this.b = cls;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class c<T extends n8s> implements f {

        /* renamed from: a  reason: collision with root package name */
        public final Class<T> f26969a;
        public final o8s<T> b;

        static {
            t2o.a(839909712);
            t2o.a(839909715);
        }

        public c(Class<T> cls, o8s<T> o8sVar) {
            this.f26969a = cls;
            this.b = o8sVar;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class d implements f {
        static {
            t2o.a(839909713);
            t2o.a(839909715);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface e {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface f {
    }

    List<e> getAbilities();

    List<f> getAdapters();
}
