package tb;

import com.taobao.login4android.broadcast.LoginAction;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final /* synthetic */ class mih {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        t2o.a(919601198);
        int[] iArr = new int[LoginAction.values().length];
        $EnumSwitchMapping$0 = iArr;
        iArr[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
        iArr[LoginAction.NOTIFY_LOGIN_FAILED.ordinal()] = 2;
        iArr[LoginAction.NOTIFY_LOGIN_CANCEL.ordinal()] = 3;
        iArr[LoginAction.NOTIFY_LOGOUT.ordinal()] = 4;
    }
}
