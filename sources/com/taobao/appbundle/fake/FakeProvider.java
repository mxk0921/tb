package com.taobao.appbundle.fake;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.upload.domain.UploadConstants;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class FakeProvider extends ContentProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(377487394);
    }

    public static /* synthetic */ Object ipc$super(FakeProvider fakeProvider, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/appbundle/fake/FakeProvider");
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fb070cb0", new Object[]{this, uri});
        }
        ckf.g(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        return UploadConstants.FILE_CONTENT_TYPE;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("77bd6b8c", new Object[]{this, uri, contentValues});
        }
        ckf.g(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        return Uri.EMPTY;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18a7a6c6", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Cursor) ipChange.ipc$dispatch("ad900bff", new Object[]{this, uri, strArr, str, strArr2, str2});
        }
        ckf.g(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        return new MatrixCursor(new String[]{"_display_name"});
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("89592153", new Object[]{this, uri, str, strArr})).intValue();
        }
        ckf.g(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        return 1;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68d633c3", new Object[]{this, uri, contentValues, str, strArr})).intValue();
        }
        ckf.g(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        return 0;
    }
}
