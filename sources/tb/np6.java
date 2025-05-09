package tb;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.passivelocation.contentprovider.TBLocationContentProvider;
import com.taobao.passivelocation.domain.LBSDTO;
import com.taobao.tao.Globals;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class np6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final LinkedBlockingQueue<LBSDTO> f24877a = new LinkedBlockingQueue<>(5);
    public static LBSDTO b;

    static {
        t2o.a(789577836);
    }

    public np6(Context context) {
    }

    public static void a(LBSDTO lbsdto) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f370dfd0", new Object[]{lbsdto});
            return;
        }
        synchronized (np6.class) {
            try {
                LinkedBlockingQueue<LBSDTO> linkedBlockingQueue = f24877a;
                if (linkedBlockingQueue.size() < 5) {
                    if (linkedBlockingQueue.offer(lbsdto)) {
                    }
                } else if (linkedBlockingQueue.size() == 5) {
                    linkedBlockingQueue.poll();
                    if (linkedBlockingQueue.offer(lbsdto)) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static LBSDTO b() {
        Cursor cursor;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LBSDTO) ipChange.ipc$dispatch("c543bc94", new Object[0]);
        }
        if (b == null) {
            try {
                cursor = Globals.getApplication().getContentResolver().query(TBLocationContentProvider.CONTENT_URI, null, null, null, "_id DESC LIMIT 1");
                if (cursor != null) {
                    try {
                        if (cursor.moveToFirst()) {
                            String string = cursor.getString(cursor.getColumnIndex("name"));
                            if (!TextUtils.isEmpty(string)) {
                                b = (LBSDTO) JSON.parseObject(string, LBSDTO.class);
                            }
                        }
                    } catch (Exception unused) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                if (cursor == null) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
                cursor.close();
            } catch (Exception unused2) {
                cursor = null;
            } catch (Throwable th3) {
                th = th3;
                cursor = null;
            }
        }
        return b;
    }

    public static void c(LBSDTO lbsdto) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff3e6cde", new Object[]{lbsdto});
        } else {
            b = lbsdto;
        }
    }

    public void d(ContentResolver contentResolver, LBSDTO lbsdto) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92c5cb99", new Object[]{this, contentResolver, lbsdto});
            return;
        }
        try {
            LBSDTO b2 = b();
            if (!(lbsdto == null || b2 == null || lbsdto.compareTo(b2) != 0)) {
                lbsdto.setTimeOnly(true);
            }
            c(lbsdto);
            a(lbsdto);
            ContentValues contentValues = new ContentValues();
            String jSONString = JSON.toJSONString(lbsdto);
            if (!TextUtils.isEmpty(jSONString)) {
                contentValues.put("name", jSONString);
                contentResolver.insert(TBLocationContentProvider.CONTENT_URI, contentValues);
            }
        } catch (Exception e) {
            Log.e("DataStorager", "save location data error: " + e.getMessage());
        }
    }
}
