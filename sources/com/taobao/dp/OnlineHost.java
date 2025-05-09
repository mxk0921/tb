package com.taobao.dp;

import com.android.alibaba.ip.runtime.IpChange;
import java.security.InvalidParameterException;
import tb.t2o;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class OnlineHost {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int Custrom_Imdex = 3;
    private String mHost;
    private int mIndex;
    private String mName;
    public static final OnlineHost GENERAL = new OnlineHost("GENERAL", "ynuf.aliapp.org", 0);
    public static final OnlineHost USA = new OnlineHost("USA", "us.ynuf.aliapp.org", 1);
    public static final OnlineHost JAPAN = new OnlineHost("JAPAN", "ynuf.aliapp.org", 2);

    private OnlineHost(String str, String str2, int i) {
        this.mName = str;
        this.mHost = str2;
        this.mIndex = i;
    }

    public static OnlineHost valueof(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnlineHost) ipChange.ipc$dispatch("15cf3421", new Object[]{str});
        }
        if (str != null && str.length() != 0) {
            return new OnlineHost("", str, 3);
        }
        throw new InvalidParameterException("Invalid Host");
    }

    public String getHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9fd6f9b", new Object[]{this});
        }
        return this.mHost;
    }

    public int getIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf396596", new Object[]{this})).intValue();
        }
        return this.mIndex;
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.mName;
    }

    static {
        t2o.a(421527555);
    }
}
