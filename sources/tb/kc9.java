package tb;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class kc9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final kc9 INSTANCE = new kc9();

    public final ErrorResult a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("30f70862", new Object[]{this, str});
        }
        ckf.g(str, "msg");
        return new ErrorResult("1023", str, (Map) null, 4, (a07) null);
    }

    public final ErrorResult c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("4da1639f", new Object[]{this, str});
        }
        ckf.g(str, "msg");
        return new ErrorResult("1024", str, (Map) null, 4, (a07) null);
    }

    public final ErrorResult e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("3aa28ab7", new Object[]{this, str});
        }
        ckf.g(str, "msg");
        return new ErrorResult("1017", str, (Map) null, 4, (a07) null);
    }

    public final ErrorResult g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("5b031355", new Object[]{this, str});
        }
        ckf.g(str, "msg");
        return new ErrorResult("1016", str, (Map) null, 4, (a07) null);
    }

    public final ErrorResult i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("5473b074", new Object[]{this, str});
        }
        ckf.g(str, "msg");
        return new ErrorResult("1026", str, (Map) null, 4, (a07) null);
    }

    public final ErrorResult k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("d1fdac04", new Object[]{this, str});
        }
        ckf.g(str, "msg");
        return new ErrorResult("1025", str, (Map) null, 4, (a07) null);
    }

    public final ErrorResult m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("845b3d5b", new Object[]{this, str});
        }
        ckf.g(str, "msg");
        return new ErrorResult("1022", str, (Map) null, 4, (a07) null);
    }

    public final ErrorResult o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("ba972291", new Object[]{this, str});
        }
        ckf.g(str, "msg");
        return new ErrorResult("1030", str, (Map) null, 4, (a07) null);
    }

    public final ErrorResult q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("4baf1637", new Object[]{this, str});
        }
        ckf.g(str, "msg");
        return new ErrorResult("1028", str, (Map) null, 4, (a07) null);
    }

    public final ErrorResult s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("349f1696", new Object[]{this, str});
        }
        ckf.g(str, "msg");
        return new ErrorResult("1027", str, (Map) null, 4, (a07) null);
    }

    public final ErrorResult u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("dd61c3d1", new Object[]{this, str});
        }
        ckf.g(str, "msg");
        return new ErrorResult("1021", str, (Map) null, 4, (a07) null);
    }

    public static /* synthetic */ ErrorResult b(kc9 kc9Var, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("94bbcbf6", new Object[]{kc9Var, str, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            str = "指定路径没有读权限";
        }
        return kc9Var.a(str);
    }

    public static /* synthetic */ ErrorResult d(kc9 kc9Var, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("dccb2d59", new Object[]{kc9Var, str, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            str = "指定路径没有写权限";
        }
        return kc9Var.c(str);
    }

    public static /* synthetic */ ErrorResult f(kc9 kc9Var, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("39754141", new Object[]{kc9Var, str, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            str = "文件摘要计算失败";
        }
        return kc9Var.e(str);
    }

    public static /* synthetic */ ErrorResult h(kc9 kc9Var, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("db277a63", new Object[]{kc9Var, str, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            str = "不支持的摘要算法";
        }
        return kc9Var.g(str);
    }

    public static /* synthetic */ ErrorResult j(kc9 kc9Var, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("7c2da824", new Object[]{kc9Var, str, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            str = "目录不为空";
        }
        return kc9Var.i(str);
    }

    public static /* synthetic */ ErrorResult l(kc9 kc9Var, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("94922e94", new Object[]{kc9Var, str, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            str = "指定路径已存在文件/目录";
        }
        return kc9Var.k(str);
    }

    public static /* synthetic */ ErrorResult n(kc9 kc9Var, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("9c54671d", new Object[]{kc9Var, str, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            str = "文件/目录不存在";
        }
        return kc9Var.m(str);
    }

    public static /* synthetic */ ErrorResult p(kc9 kc9Var, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("3326aea7", new Object[]{kc9Var, str, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            str = "单个文件大小超限";
        }
        return kc9Var.o(str);
    }

    public static /* synthetic */ ErrorResult r(kc9 kc9Var, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("85a9a5c1", new Object[]{kc9Var, str, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            str = "指定路径不是目录";
        }
        return kc9Var.q(str);
    }

    public static /* synthetic */ ErrorResult t(kc9 kc9Var, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("faa61842", new Object[]{kc9Var, str, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            str = "指定路径不是文件";
        }
        return kc9Var.s(str);
    }

    public static /* synthetic */ ErrorResult v(kc9 kc9Var, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("8c877567", new Object[]{kc9Var, str, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            str = "上级目录不存在";
        }
        return kc9Var.u(str);
    }
}
