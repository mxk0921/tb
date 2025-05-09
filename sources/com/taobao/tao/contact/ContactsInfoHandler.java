package com.taobao.tao.contact;

import com.android.alibaba.ip.runtime.IpChange;
import tb.eqb;
import tb.lz9;
import tb.t2o;
import tb.zk4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ContactsInfoHandler implements zk4.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ContactsInfoHandler";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements eqb.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(ContactsInfoHandler contactsInfoHandler) {
        }

        @Override // tb.eqb.a
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd374b32", new Object[]{this, str});
            } else {
                zk4.c().a(str);
            }
        }
    }

    static {
        t2o.a(666894389);
        t2o.a(667942936);
    }

    @Override // tb.zk4.b
    public void getContactsInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3390b1e", new Object[]{this});
        } else {
            lz9.a(null, new a(this));
        }
    }
}
