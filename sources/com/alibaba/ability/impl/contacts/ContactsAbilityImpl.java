package com.alibaba.ability.impl.contacts;

import android.content.Context;
import android.content.Intent;
import androidx.core.content.ContextCompat;
import com.alibaba.ability.impl.TransParentActivity;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsContactsAbility;
import com.taobao.android.abilityidl.ability.ContactsQueryResult;
import com.taobao.android.abilityidl.ability.ContactsResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.a07;
import tb.al4;
import tb.ckf;
import tb.cqb;
import tb.dqb;
import tb.kdb;
import tb.t2o;
import tb.tk4;
import tb.wk4;
import tb.xhv;
import tb.yk4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ContactsAbilityImpl extends AbsContactsAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(102760452);
    }

    public static /* synthetic */ Object ipc$super(ContactsAbilityImpl contactsAbilityImpl, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/contacts/ContactsAbilityImpl");
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContactsAbility
    public void choose(kdb kdbVar, cqb cqbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eaa7ebe", new Object[]{this, kdbVar, cqbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(cqbVar, "callback");
        Context context = kdbVar.l().getContext();
        if (context == null) {
            cqbVar.O(ErrorResult.a.Companion.g("context is null"));
        } else if (ContextCompat.checkSelfPermission(context, "android.permission.READ_CONTACTS") != 0) {
            cqbVar.O(new ErrorResult("NO_PERMISSION", "no permission", (Map) null, 4, (a07) null));
        } else {
            TransParentActivity.Companion.b(new Intent(context, TransParentActivity.class), context, new yk4(cqbVar));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsContactsAbility
    public void query(kdb kdbVar, al4 al4Var, dqb dqbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e193795", new Object[]{this, kdbVar, al4Var, dqbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(al4Var, "queryParam");
        ckf.g(dqbVar, "callback");
        Context context = kdbVar.l().getContext();
        if (context == null) {
            dqbVar.O(ErrorResult.a.Companion.g("context is null"));
        } else if (ContextCompat.checkSelfPermission(context, "android.permission.READ_CONTACTS") != 0) {
            dqbVar.O(new ErrorResult("NO_PERMISSION", "no permission", (Map) null, 4, (a07) null));
        } else {
            String str = al4Var.f15802a;
            String str2 = al4Var.b;
            if ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) {
                ErrorResult.a.C0055a aVar = ErrorResult.a.Companion;
                dqbVar.O(aVar.g("name:" + str + ",phone:" + str2));
                return;
            }
            List<tk4> a2 = wk4.a(context, null, str, str2, dqbVar);
            if (a2 == null) {
                ContactsQueryResult contactsQueryResult = new ContactsQueryResult();
                contactsQueryResult.contacts = new ArrayList();
                xhv xhvVar = xhv.INSTANCE;
                dqbVar.S0(contactsQueryResult);
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (tk4 tk4Var : a2) {
                ContactsResult contactsResult = new ContactsResult();
                String str3 = tk4Var.f28761a;
                String str4 = "";
                if (str3 == null) {
                    str3 = str4;
                }
                contactsResult.name = str3;
                String str5 = tk4Var.b;
                if (str5 != null) {
                    str4 = str5;
                }
                contactsResult.phone = str4;
                arrayList.add(contactsResult);
            }
            ContactsQueryResult contactsQueryResult2 = new ContactsQueryResult();
            contactsQueryResult2.contacts = arrayList;
            dqbVar.S0(contactsQueryResult2);
        }
    }
}
