package tb;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class lc9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final lc9 INSTANCE = new lc9();

    static {
        t2o.a(106954762);
    }

    public final ErrorResult B(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("1be8e6fa", new Object[]{this, str});
        }
        ckf.g(str, "msg");
        return new ErrorResult("ILLEGAL_PATH", str, (Map) null, 4, (a07) null);
    }

    public final ErrorResult a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("30f70862", new Object[]{this, str});
        }
        ckf.g(str, "msg");
        return new ErrorResult("ILLEGAL_PATH", str, (Map) null, 4, (a07) null);
    }

    public final ErrorResult c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("4da1639f", new Object[]{this, str});
        }
        ckf.g(str, "msg");
        return new ErrorResult("ILLEGAL_PATH", str, (Map) null, 4, (a07) null);
    }

    public final ErrorResult e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("3aa28ab7", new Object[]{this, str});
        }
        ckf.g(str, "msg");
        return new ErrorResult("DIGEST_COMPUTER_ERROR", str, (Map) null, 4, (a07) null);
    }

    public final ErrorResult g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("5b031355", new Object[]{this, str});
        }
        ckf.g(str, "msg");
        return ErrorResult.a.Companion.g(str);
    }

    public final ErrorResult i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("e40978ea", new Object[]{this, str});
        }
        ckf.g(str, "msg");
        return new ErrorResult("DIR_NOT_EXIST", str, (Map) null, 4, (a07) null);
    }

    public final ErrorResult k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("e7489822", new Object[]{this, str});
        }
        ckf.g(str, "msg");
        return new ErrorResult("OUT_OF_SPACE", str, (Map) null, 4, (a07) null);
    }

    public final ErrorResult m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("5473b074", new Object[]{this, str});
        }
        ckf.g(str, "msg");
        return new ErrorResult("DIR_NOT_EMPTY", str, (Map) null, 4, (a07) null);
    }

    public final ErrorResult o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("d1fdac04", new Object[]{this, str});
        }
        ckf.g(str, "msg");
        return new ErrorResult("ALREADY_EXIST", str, (Map) null, 4, (a07) null);
    }

    public final ErrorResult q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("845b3d5b", new Object[]{this, str});
        }
        ckf.g(str, "msg");
        return new ErrorResult("FILE_NOT_EXIST", str, (Map) null, 4, (a07) null);
    }

    public final ErrorResult s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("ba972291", new Object[]{this, str});
        }
        ckf.g(str, "msg");
        return new ErrorResult("SINGLE_FILE_OUT_OF_SPACE", str, (Map) null, 4, (a07) null);
    }

    public final ErrorResult u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("4baf1637", new Object[]{this, str});
        }
        ckf.g(str, "msg");
        return new ErrorResult("NOT_DIR", str, (Map) null, 4, (a07) null);
    }

    public final ErrorResult w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("349f1696", new Object[]{this, str});
        }
        ckf.g(str, "msg");
        return new ErrorResult("NOT_FILE", str, (Map) null, 4, (a07) null);
    }

    public final ErrorResult y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("9ddabd31", new Object[]{this, str});
        }
        ckf.g(str, "msg");
        return new ErrorResult("NOT_ZIP_FILE", str, (Map) null, 4, (a07) null);
    }

    public final ErrorResult z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("dd61c3d1", new Object[]{this, str});
        }
        ckf.g(str, "msg");
        return new ErrorResult("ILLEGAL_PATH", str, (Map) null, 4, (a07) null);
    }

    public static /* synthetic */ ErrorResult A(lc9 lc9Var, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("3cc0de08", new Object[]{lc9Var, str, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            str = "上级目录不存在";
        }
        return lc9Var.z(str);
    }

    public static /* synthetic */ ErrorResult b(lc9 lc9Var, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("ef266a19", new Object[]{lc9Var, str, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            str = "指定路径没有读权限";
        }
        return lc9Var.a(str);
    }

    public static /* synthetic */ ErrorResult d(lc9 lc9Var, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("d54276d6", new Object[]{lc9Var, str, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            str = "指定路径没有写权限";
        }
        return lc9Var.c(str);
    }

    public static /* synthetic */ ErrorResult f(lc9 lc9Var, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("de4591ee", new Object[]{lc9Var, str, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            str = "文件摘要计算失败";
        }
        return lc9Var.e(str);
    }

    public static /* synthetic */ ErrorResult h(lc9 lc9Var, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("1338ab8c", new Object[]{lc9Var, str, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            str = "不支持的摘要算法";
        }
        return lc9Var.g(str);
    }

    public static /* synthetic */ ErrorResult j(lc9 lc9Var, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("1b5516a1", new Object[]{lc9Var, str, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            str = "目录不存在";
        }
        return lc9Var.i(str);
    }

    public static /* synthetic */ ErrorResult l(lc9 lc9Var, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("994c19d9", new Object[]{lc9Var, str, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            str = "存储空间已满";
        }
        return lc9Var.k(str);
    }

    public static /* synthetic */ ErrorResult n(lc9 lc9Var, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("928b292b", new Object[]{lc9Var, str, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            str = "目录不为空";
        }
        return lc9Var.m(str);
    }

    public static /* synthetic */ ErrorResult p(lc9 lc9Var, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("11285cbb", new Object[]{lc9Var, str, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            str = "指定路径已存在文件/目录";
        }
        return lc9Var.o(str);
    }

    public static /* synthetic */ ErrorResult r(lc9 lc9Var, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("1a053292", new Object[]{lc9Var, str, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            str = "文件不存在";
        }
        return lc9Var.q(str);
    }

    public static /* synthetic */ ErrorResult t(lc9 lc9Var, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("3f52dcc8", new Object[]{lc9Var, str, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            str = "单个文件大小超限";
        }
        return lc9Var.s(str);
    }

    public static /* synthetic */ ErrorResult v(lc9 lc9Var, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("1b045d6e", new Object[]{lc9Var, str, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            str = "指定路径不是目录";
        }
        return lc9Var.u(str);
    }

    public static /* synthetic */ ErrorResult x(lc9 lc9Var, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("19389e4d", new Object[]{lc9Var, str, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            str = "指定路径不是文件";
        }
        return lc9Var.w(str);
    }
}
