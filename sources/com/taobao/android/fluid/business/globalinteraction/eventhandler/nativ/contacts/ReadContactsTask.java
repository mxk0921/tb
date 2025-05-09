package com.taobao.android.fluid.business.globalinteraction.eventhandler.nativ.contacts;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.os.AsyncTask;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import tb.aca;
import tb.ir9;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ReadContactsTask extends AsyncTask<Void, Void, ContactsModel> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_MAX_PHONE_NUMBER = "maxPhoneNumber";
    public static final String d = ReadContactsTask.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<Context> f7674a;
    public final int b;
    public final a c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class ContactsModel implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final String KEY_PHONE_NUMBERS = "phoneNumbers";
        private static final String KEY_STATUS = "status";
        public static final String STATUS_FAIL = "fail";
        public static final String STATUS_SUCCESS = "success";
        public List<String> phoneNumbers;
        public String status;

        static {
            t2o.a(468713506);
        }

        public JSONObject toJSONObject() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("e5b411a9", new Object[]{this});
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("status", (Object) this.status);
                jSONObject.put(KEY_PHONE_NUMBERS, (Object) this.phoneNumbers);
            } catch (Throwable th) {
                String a2 = ReadContactsTask.a();
                ir9.b(a2, "【toJSONObject】error: " + th.toString());
            }
            return jSONObject;
        }

        public String toJSONString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d39b47a5", new Object[]{this});
            }
            try {
                return JSON.toJSONString(this);
            } catch (Throwable th) {
                String a2 = ReadContactsTask.a();
                ir9.b(a2, "【toJSONString】error: " + th.toString());
                return "";
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface a {
    }

    static {
        t2o.a(468713505);
    }

    public ReadContactsTask(Context context, int i, a aVar) {
        if (context == null) {
            ir9.b(d, "【ReadContactsTask】context is null");
            return;
        }
        this.f7674a = new WeakReference<>(context.getApplicationContext());
        this.b = i;
        this.c = aVar;
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return d;
    }

    public static /* synthetic */ Object ipc$super(ReadContactsTask readContactsTask, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1325021319) {
            super.onPostExecute(objArr[0]);
            return null;
        } else if (hashCode == -886319787) {
            super.onCancelled(objArr[0]);
            return null;
        } else if (hashCode == 566591929) {
            super.onCancelled();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/fluid/business/globalinteraction/eventhandler/nativ/contacts/ReadContactsTask");
        }
    }

    /* renamed from: b */
    public ContactsModel doInBackground(Void... voidArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContactsModel) ipChange.ipc$dispatch("8a0507db", new Object[]{this, voidArr});
        }
        String str = d;
        ir9.b(str, "【doInBackground-getLocalContacts】start");
        Context context = this.f7674a.get();
        if (context != null) {
            return c(context);
        }
        ir9.b(str, "【doInBackground-getLocalContacts】context is null");
        return null;
    }

    /* renamed from: e */
    public void onCancelled(ContactsModel contactsModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9b6ebd5", new Object[]{this, contactsModel});
        } else {
            super.onCancelled(contactsModel);
        }
    }

    /* renamed from: f */
    public void onPostExecute(ContactsModel contactsModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686e66f9", new Object[]{this, contactsModel});
            return;
        }
        super.onPostExecute(contactsModel);
        ir9.b(d, "【onPostExecute-getLocalContacts】start");
        a aVar = this.c;
        if (aVar != null) {
            ((aca.c) aVar).a(contactsModel);
        }
        this.f7674a = null;
    }

    public final boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("faa26910", new Object[]{this, str})).booleanValue();
        }
        return Pattern.compile("^1[3-9]\\d{9}$").matcher(str).matches();
    }

    @Override // android.os.AsyncTask
    public void onCancelled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21c581b9", new Object[]{this});
        } else {
            super.onCancelled();
        }
    }

    public final ContactsModel c(Context context) {
        Cursor cursor;
        Throwable th;
        ContentResolver contentResolver;
        String str = "has_phone_number";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContactsModel) ipChange.ipc$dispatch("104ca19", new Object[]{this, context});
        }
        String str2 = d;
        ir9.b(str2, "【getLocalContacts】start");
        ContactsModel contactsModel = new ContactsModel();
        contactsModel.phoneNumbers = new ArrayList();
        if (context == null) {
            ir9.b(str2, "【getLocalContacts】context is null");
            contactsModel.status = "fail";
            return contactsModel;
        }
        Cursor cursor2 = null;
        try {
            contentResolver = context.getContentResolver();
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
        if (contentResolver == null) {
            ir9.b(str2, "【getLocalContacts】contentResolver is null");
            contactsModel.status = "fail";
            return contactsModel;
        }
        Cursor query = contentResolver.query(ContactsContract.Contacts.CONTENT_URI, new String[]{"_id", "display_name", str}, null, null, "display_name ASC ");
        try {
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
            cursor2 = query;
            try {
                contactsModel.status = "fail";
                ir9.a(d, "【getLocalContacts】error: " + th.toString());
                ir9.b(d, "【getLocalContacts】end");
                return contactsModel;
            } finally {
                if (cursor2 != null && !cursor2.isClosed()) {
                    cursor2.close();
                }
                if (cursor != null && !cursor.isClosed()) {
                    cursor.close();
                }
            }
        }
        if (query == null) {
            ir9.b(str2, "【getLocalContacts】contactCursor is null");
            contactsModel.status = "fail";
            if (query != null && !query.isClosed()) {
                query.close();
            }
            return contactsModel;
        }
        while (query.moveToNext()) {
            String string = query.getString(query.getColumnIndex("_id"));
            query.getString(query.getColumnIndex("display_name"));
            if (query.getInt(query.getColumnIndex(str)) > 0) {
                str = str;
                cursor2 = contentResolver.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, "contact_id = ?", new String[]{string}, null);
                if (cursor2 == null) {
                    ir9.b(d, "【getLocalContacts】phoneCursor is null");
                    contactsModel.status = "fail";
                    if (!query.isClosed()) {
                        query.close();
                    }
                    if (cursor2 != null && !cursor2.isClosed()) {
                        cursor2.close();
                    }
                    return contactsModel;
                }
                while (cursor2.moveToNext()) {
                    String string2 = cursor2.getString(cursor2.getColumnIndex("data1"));
                    if (this.b <= 0 || contactsModel.phoneNumbers.size() <= this.b) {
                        String d2 = d(string2);
                        if (d2 != null) {
                            contactsModel.phoneNumbers.add(d2);
                        }
                    } else {
                        cursor2.close();
                        query.close();
                        contactsModel.status = "success";
                        ir9.a(d, "【getLocalContacts】The number of mobile phone numbers has reached its maximum: " + this.b);
                        if (!query.isClosed()) {
                            query.close();
                        }
                        if (!cursor2.isClosed()) {
                            cursor2.close();
                        }
                        return contactsModel;
                    }
                }
                cursor2.close();
            } else {
                str = str;
            }
        }
        query.close();
        contactsModel.status = "success";
        if (!query.isClosed()) {
            query.close();
        }
        if (cursor2 != null && !cursor2.isClosed()) {
            cursor2.close();
        }
        ir9.b(d, "【getLocalContacts】end");
        return contactsModel;
    }

    public final String d(String str) {
        String replaceAll;
        char[] charArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("431fc12c", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            replaceAll = str.replaceAll(" ", "");
        } catch (Exception e) {
            ir9.b(d, "【getRealPhoneNumber】phoneNumber: " + str + ", error: " + e.toString());
        }
        if (replaceAll.length() < 11) {
            return null;
        }
        if (replaceAll.length() != 11) {
            if (replaceAll.startsWith("+86")) {
                replaceAll = replaceAll.substring(3);
            }
            StringBuilder sb = new StringBuilder();
            for (char c : replaceAll.toCharArray()) {
                if (Character.isDigit(c)) {
                    sb.append(c);
                }
            }
            if (sb.length() == 11) {
                String sb2 = sb.toString();
                if (g(sb2)) {
                    return sb2;
                }
            }
        } else if (g(replaceAll)) {
            return replaceAll;
        }
        return null;
    }
}
