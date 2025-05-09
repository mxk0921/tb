package com.taobao.message.util;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.env;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MessageNavProcessorV2NodeUriFilterItem0 extends env {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(578814143);
    }

    public static /* synthetic */ Object ipc$super(MessageNavProcessorV2NodeUriFilterItem0 messageNavProcessorV2NodeUriFilterItem0, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/util/MessageNavProcessorV2NodeUriFilterItem0");
    }

    @Override // tb.env, tb.dnv
    public boolean hostFilter(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0d619d5", new Object[]{this, str})).booleanValue();
        }
        return str.equals("tb.cn");
    }

    @Override // tb.env, tb.dnv
    public boolean pathFilter(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee8b1ad2", new Object[]{this, str})).booleanValue();
        }
        if (str.contains("/n/im/dynamic/") || str.contains("/n/im/chatlayer") || str.contains("/im/fragment/auraFragment") || str.contains("/n/im/group/newchat") || str.contains("/n/im/chat") || str.contains("/n/ww/newchat") || str.contains("/n/ww/chatdetail") || str.contains("/n/ww/official") || str.contains("/n/ww/inner/official") || str.contains("/n/im/openapi")) {
            return true;
        }
        return false;
    }
}
