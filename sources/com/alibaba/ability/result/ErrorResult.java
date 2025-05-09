package com.alibaba.ability.result;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import tb.a07;
import tb.c3c;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ErrorResult extends ExecuteResult implements c3c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String code;
    private final String msg;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final C0055a Companion = new C0055a(null);

        /* compiled from: Taobao */
        /* renamed from: com.alibaba.ability.result.ErrorResult$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class C0055a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            static {
                t2o.a(144703590);
            }

            public C0055a() {
            }

            @JvmStatic
            public final ErrorResult a(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (ErrorResult) ipChange.ipc$dispatch("28c3cad2", new Object[]{this, str});
                }
                if (str == null) {
                    str = "";
                }
                return new ErrorResult(405, str, (Map) null, 4, (a07) null);
            }

            @JvmStatic
            public final ErrorResult b(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (ErrorResult) ipChange.ipc$dispatch("18177aae", new Object[]{this, str});
                }
                if (str == null) {
                    str = "";
                }
                return new ErrorResult(102, str, (Map) null, 4, (a07) null);
            }

            @JvmStatic
            public final ErrorResult c(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (ErrorResult) ipChange.ipc$dispatch("30a1e236", new Object[]{this, str});
                }
                if (str == null) {
                    str = "";
                }
                return new ErrorResult(100, str, (Map) null, 4, (a07) null);
            }

            @JvmStatic
            public final ErrorResult d(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (ErrorResult) ipChange.ipc$dispatch("daf2e7fc", new Object[]{this, str});
                }
                if (str == null) {
                    str = "";
                }
                return new ErrorResult(101, str, (Map) null, 4, (a07) null);
            }

            @JvmStatic
            public final ErrorResult e(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (ErrorResult) ipChange.ipc$dispatch("3d215d82", new Object[]{this, str});
                }
                if (str == null) {
                    str = "";
                }
                return new ErrorResult(403, str, (Map) null, 4, (a07) null);
            }

            @JvmStatic
            public final ErrorResult f(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (ErrorResult) ipChange.ipc$dispatch("d513fbfe", new Object[]{this, str});
                }
                if (str == null) {
                    str = "";
                }
                return new ErrorResult(199, str, (Map) null, 4, (a07) null);
            }

            @JvmStatic
            public final ErrorResult g(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (ErrorResult) ipChange.ipc$dispatch("57c2f2ea", new Object[]{this, str});
                }
                if (str == null) {
                    str = "";
                }
                return new ErrorResult(500, str, (Map) null, 4, (a07) null);
            }

            public /* synthetic */ C0055a(a07 a07Var) {
                this();
            }
        }

        static {
            t2o.a(144703589);
        }

        @JvmStatic
        public static final ErrorResult a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ErrorResult) ipChange.ipc$dispatch("28c3cad2", new Object[]{str});
            }
            return Companion.a(str);
        }

        @JvmStatic
        public static final ErrorResult b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ErrorResult) ipChange.ipc$dispatch("18177aae", new Object[]{str});
            }
            return Companion.b(str);
        }

        @JvmStatic
        public static final ErrorResult c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ErrorResult) ipChange.ipc$dispatch("30a1e236", new Object[]{str});
            }
            return Companion.c(str);
        }

        @JvmStatic
        public static final ErrorResult d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ErrorResult) ipChange.ipc$dispatch("daf2e7fc", new Object[]{str});
            }
            return Companion.d(str);
        }

        @JvmStatic
        public static final ErrorResult e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ErrorResult) ipChange.ipc$dispatch("3d215d82", new Object[]{str});
            }
            return Companion.e(str);
        }

        @JvmStatic
        public static final ErrorResult f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ErrorResult) ipChange.ipc$dispatch("d513fbfe", new Object[]{str});
            }
            return Companion.f(str);
        }

        @JvmStatic
        public static final ErrorResult g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ErrorResult) ipChange.ipc$dispatch("57c2f2ea", new Object[]{str});
            }
            return Companion.g(str);
        }
    }

    static {
        t2o.a(144703588);
        t2o.a(144703598);
    }

    public ErrorResult(String str) {
        this(str, (String) null, (Map) null, 6, (a07) null);
    }

    public static /* synthetic */ Object ipc$super(ErrorResult errorResult, String str, Object... objArr) {
        if (str.hashCode() == -155485817) {
            return super.toFormattedData();
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/result/ErrorResult");
    }

    public final String getCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa4e0476", new Object[]{this});
        }
        return this.code;
    }

    public final String getMsg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a817838e", new Object[]{this});
        }
        return this.msg;
    }

    @Override // com.alibaba.ability.result.ExecuteResult
    public Map<String, Object> toFormattedData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f6bb7987", new Object[]{this});
        }
        Map<String, Object> t = kotlin.collections.a.t(super.toFormattedData());
        t.put("code", this.code);
        t.put("msg", this.msg);
        return t;
    }

    public ErrorResult(String str, int i) {
        this(str, null, null, i, 6, null);
    }

    public ErrorResult(String str, String str2) {
        this(str, str2, (Map) null, 4, (a07) null);
    }

    public ErrorResult(String str, String str2, int i) {
        this(str, str2, null, i, 4, null);
    }

    public /* synthetic */ ErrorResult(int i, String str, Map map, int i2, a07 a07Var) {
        this(i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : map);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorResult(int i, String str, Map<String, ? extends Object> map) {
        super(map, null, 2, null);
        ckf.g(str, "msg");
        this.code = MegaStatusCode.Companion.a(i);
        this.msg = str;
        this.mStatusCode = i;
    }

    public /* synthetic */ ErrorResult(String str, String str2, Map map, int i, int i2, a07 a07Var) {
        this(str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? null : map, i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ErrorResult(String str, String str2, Map<String, ? extends Object> map, int i) {
        this(str, str2, map);
        ckf.g(str, "code");
        ckf.g(str2, "msg");
        this.mStatusCode = 1000 + ((i < 0 || i > 2147482647) ? 0 : i);
    }

    public /* synthetic */ ErrorResult(String str, String str2, Map map, int i, a07 a07Var) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : map);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorResult(String str, String str2, Map<String, ? extends Object> map) {
        super(map, null, 2, null);
        ckf.g(str, "code");
        ckf.g(str2, "msg");
        this.code = str;
        this.msg = str2;
        this.mStatusCode = 1000;
    }
}
