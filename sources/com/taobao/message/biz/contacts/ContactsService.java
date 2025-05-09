package com.taobao.message.biz.contacts;

import com.taobao.message.kit.core.IObserver;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface ContactsService {
    void getRecentContacts(List<String> list, IObserver<List<Contacts>> iObserver);
}
