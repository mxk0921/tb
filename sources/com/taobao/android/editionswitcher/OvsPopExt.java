package com.taobao.android.editionswitcher;

import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class OvsPopExt implements Serializable {
    public static final int KIND_CHANGE_AREA_COUNTDOWN = 1;
    public static final int KIND_CHANGE_AREA_DEFAULT = 0;
    public static final int KIND_CHANGE_AREA_FORCE = 2;
    public int ovsRemindCountDown;
    public int ovsExpTime = 7;
    public int ovsExpDaysCount = 1;
    public int ovsExpTotalCount = 1;
    public int ovsRemindKind = 0;

    static {
        t2o.a(456130586);
    }
}
