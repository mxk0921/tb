package com.taobao.message.util;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.env;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MessageNavProcessorV2NodeUriFilterItem10 extends env {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(578814145);
    }

    public static /* synthetic */ Object ipc$super(MessageNavProcessorV2NodeUriFilterItem10 messageNavProcessorV2NodeUriFilterItem10, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/util/MessageNavProcessorV2NodeUriFilterItem10");
    }

    @Override // tb.env, tb.dnv
    public boolean pathFilter(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee8b1ad2", new Object[]{this, str})).booleanValue();
        }
        return str.equals("/app/message-social-front/mpds-container/msg-error");
    }

    @Override // tb.env, tb.dnv
    public boolean schemeFilter(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9fb6ac52", new Object[]{this, str})).booleanValue();
        }
        return str.equals("https");
    }

    @Override // tb.env, tb.dnv
    public boolean hostFilter(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0d619d5", new Object[]{this, str})).booleanValue();
        }
        return str.equals("web.m.taobao.com") || str.equals("web.wapa.taobao.com");
    }
}
