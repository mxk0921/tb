package com.taobao.android.nanocompose.runtime.pipeline.render;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.a07;
import tb.ckf;
import tb.e7z;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class FlattenedNodeMutation {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final Type f9030a;
    public final e7z b;
    public final e7z c;
    public final e7z d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class Type extends Enum<Type> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final Type CREATE = new Type("CREATE", 0);
        public static final Type INSERT = new Type("INSERT", 1);
        public static final Type REMOVE = new Type("REMOVE", 2);
        public static final Type UPDATE = new Type("UPDATE", 3);
        private static final /* synthetic */ Type[] $VALUES = $values();

        private static final /* synthetic */ Type[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Type[]) ipChange.ipc$dispatch("c365359e", new Object[0]) : new Type[]{CREATE, INSERT, REMOVE, UPDATE};
        }

        private Type(String str, int i) {
        }

        public static /* synthetic */ Object ipc$super(Type type, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/runtime/pipeline/render/FlattenedNodeMutation$Type");
        }

        public static Type valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("908bf353", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(Type.class, str);
            }
            return (Type) valueOf;
        }

        public static Type[] values() {
            Object clone;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                clone = ipChange.ipc$dispatch("8c5df342", new Object[0]);
            } else {
                clone = $VALUES.clone();
            }
            return (Type[]) clone;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(598737469);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final FlattenedNodeMutation a(e7z e7zVar, e7z e7zVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FlattenedNodeMutation) ipChange.ipc$dispatch("eb2425d0", new Object[]{this, e7zVar, e7zVar2});
            }
            ckf.g(e7zVar2, "newFlattenedNode");
            return new FlattenedNodeMutation(Type.CREATE, e7zVar, null, e7zVar2, 0, 20, null);
        }

        public final FlattenedNodeMutation b(e7z e7zVar, e7z e7zVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FlattenedNodeMutation) ipChange.ipc$dispatch("2852348", new Object[]{this, e7zVar, e7zVar2});
            }
            ckf.g(e7zVar2, "oldFlattenedNode");
            return new FlattenedNodeMutation(Type.REMOVE, e7zVar, e7zVar2, null, 0, 24, null);
        }

        public final FlattenedNodeMutation c(e7z e7zVar, e7z e7zVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FlattenedNodeMutation) ipChange.ipc$dispatch("18ef1223", new Object[]{this, e7zVar, e7zVar2});
            }
            ckf.g(e7zVar, "oldFlattenedNode");
            ckf.g(e7zVar2, "newFlattenedNode");
            return new FlattenedNodeMutation(Type.UPDATE, null, e7zVar, e7zVar2, 0, 18, null);
        }

        public a() {
        }
    }

    static {
        t2o.a(598737468);
    }

    public FlattenedNodeMutation(Type type, e7z e7zVar, e7z e7zVar2, e7z e7zVar3, int i) {
        this.f9030a = type;
        this.b = e7zVar;
        this.c = e7zVar2;
        this.d = e7zVar3;
    }

    public final e7z a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e7z) ipChange.ipc$dispatch("88a044a5", new Object[]{this});
        }
        return this.d;
    }

    public final e7z b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e7z) ipChange.ipc$dispatch("ee1f61ec", new Object[]{this});
        }
        return this.c;
    }

    public final e7z c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e7z) ipChange.ipc$dispatch("69acf95b", new Object[]{this});
        }
        return this.b;
    }

    public final Type d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Type) ipChange.ipc$dispatch("b5bf5451", new Object[]{this});
        }
        return this.f9030a;
    }

    public /* synthetic */ FlattenedNodeMutation(Type type, e7z e7zVar, e7z e7zVar2, e7z e7zVar3, int i, int i2, a07 a07Var) {
        this(type, (i2 & 2) != 0 ? null : e7zVar, (i2 & 4) != 0 ? null : e7zVar2, (i2 & 8) != 0 ? null : e7zVar3, (i2 & 16) != 0 ? -1 : i);
    }
}
