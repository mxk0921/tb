package com.taobao.android.interactive_common.view;

import android.app.Activity;
import android.app.Dialog;
import android.app.FragmentManager;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.util.Constants;
import com.taobao.taobao.R;
import com.taobao.uikit.feature.callback.ImageSaveCallback;
import com.taobao.uikit.feature.callback.TouchEventCallback;
import com.taobao.uikit.feature.features.AbsFeature;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;
import tb.s0m;
import tb.s8d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LocalImageSaveFeature extends AbsFeature<ImageView> implements ImageSaveCallback, TouchEventCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int FAIL_FULL = 2;
    private static final int FAIL_GET = 1;
    public static final int IMAGE_SAVE_REQUEST_CODE = 1502;
    private static final int SUCCESS_SAVE = 0;
    private Context mContext;
    private Dialog mDialog;
    private g mSaveFileTask;
    private h mSaveFileUseMediaStoreTask;
    private Bitmap mWaterMarkBitmap;
    private String mWaterMarkIconUrl;
    private String mWaterMarkText;
    private PointF mStartPoint = new PointF();
    private Bitmap mSaveBmp = null;
    private boolean mActive = false;
    private HashMap<String, f> mChoices = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.interactive_common.view.LocalImageSaveFeature$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class C0430a implements e {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ImageView f8109a;

            public C0430a(ImageView imageView) {
                this.f8109a = imageView;
            }

            public void a(String str, Bitmap bitmap) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a4bce4fb", new Object[]{this, str, bitmap});
                    return;
                }
                LocalImageSaveFeature.access$102(LocalImageSaveFeature.this, bitmap);
                LocalImageSaveFeature.access$200(LocalImageSaveFeature.this, this.f8109a);
            }
        }

        public a() {
        }

        @Override // com.taobao.android.interactive_common.view.LocalImageSaveFeature.f
        public void doMethod(ImageView imageView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b6388dcd", new Object[]{this, imageView});
            } else if (!TextUtils.isEmpty(LocalImageSaveFeature.access$000(LocalImageSaveFeature.this))) {
                LocalImageSaveFeature localImageSaveFeature = LocalImageSaveFeature.this;
                LocalImageSaveFeature.access$300(localImageSaveFeature, LocalImageSaveFeature.access$000(localImageSaveFeature), new C0430a(imageView));
            } else {
                LocalImageSaveFeature.access$200(LocalImageSaveFeature.this, imageView);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f8110a;

        public b(f fVar) {
            this.f8110a = fVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            this.f8110a.doMethod(LocalImageSaveFeature.this.getHost());
            LocalImageSaveFeature.access$400(LocalImageSaveFeature.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f8111a;
        public final /* synthetic */ String b;

        public c(LocalImageSaveFeature localImageSaveFeature, e eVar, String str) {
            this.f8111a = eVar;
            this.b = str;
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            ((a.C0430a) this.f8111a).a(this.b, null);
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f8112a;
        public final /* synthetic */ String b;

        public d(LocalImageSaveFeature localImageSaveFeature, e eVar, String str) {
            this.f8112a = eVar;
            this.b = str;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            BitmapDrawable drawable = succPhenixEvent.getDrawable();
            if (drawable != null) {
                ((a.C0430a) this.f8112a).a(this.b, drawable.getBitmap());
            } else {
                ((a.C0430a) this.f8112a).a(this.b, null);
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface e {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface f {
        void doMethod(ImageView imageView);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class g extends AsyncTask<Object, Void, Integer> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Uri f8113a;

        public /* synthetic */ g(LocalImageSaveFeature localImageSaveFeature, a aVar) {
            this();
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/interactive_common/view/LocalImageSaveFeature$SaveFileTask");
        }

        /* renamed from: b */
        public void onPostExecute(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("be14b67a", new Object[]{this, num});
            } else {
                LocalImageSaveFeature.access$800(LocalImageSaveFeature.this, num, this.f8113a, true);
            }
        }

        public g() {
        }

        /* renamed from: a */
        public Integer doInBackground(Object... objArr) {
            Throwable th;
            ParcelFileDescriptor parcelFileDescriptor;
            Exception e;
            FileOutputStream fileOutputStream;
            int i = 1;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Integer) ipChange.ipc$dispatch("3c207953", new Object[]{this, objArr});
            }
            this.f8113a = (Uri) objArr[0];
            Bitmap bitmap = (Bitmap) objArr[1];
            if (bitmap != null) {
                FileOutputStream fileOutputStream2 = null;
                try {
                    parcelFileDescriptor = LocalImageSaveFeature.access$700(LocalImageSaveFeature.this).getContentResolver().openFileDescriptor(this.f8113a, "w");
                    try {
                        try {
                            fileOutputStream = new FileOutputStream(parcelFileDescriptor.getFileDescriptor());
                        } catch (Exception e2) {
                            e = e2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception e3) {
                    e = e3;
                    parcelFileDescriptor = null;
                } catch (Throwable th3) {
                    th = th3;
                    parcelFileDescriptor = null;
                }
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                    try {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        parcelFileDescriptor.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                    i = 0;
                } catch (Exception e5) {
                    e = e5;
                    fileOutputStream2 = fileOutputStream;
                    e.printStackTrace();
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.flush();
                            fileOutputStream2.close();
                        } catch (IOException e6) {
                            e6.printStackTrace();
                            i = 2;
                            return Integer.valueOf(i);
                        }
                    }
                    if (parcelFileDescriptor != null) {
                        parcelFileDescriptor.close();
                    }
                    i = 2;
                    return Integer.valueOf(i);
                } catch (Throwable th4) {
                    th = th4;
                    fileOutputStream2 = fileOutputStream;
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.flush();
                            fileOutputStream2.close();
                        } catch (IOException e7) {
                            e7.printStackTrace();
                            throw th;
                        }
                    }
                    if (parcelFileDescriptor != null) {
                        parcelFileDescriptor.close();
                    }
                    throw th;
                }
            }
            return Integer.valueOf(i);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class h extends AsyncTask<Object, Void, Integer> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Uri f8114a;

        public /* synthetic */ h(LocalImageSaveFeature localImageSaveFeature, a aVar) {
            this();
        }

        public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/interactive_common/view/LocalImageSaveFeature$SaveFileUseMediaStoreTask");
        }

        /* renamed from: b */
        public void onPostExecute(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("be14b67a", new Object[]{this, num});
            } else {
                LocalImageSaveFeature.access$800(LocalImageSaveFeature.this, num, this.f8114a, false);
            }
        }

        public h() {
        }

        /* renamed from: a */
        public Integer doInBackground(Object... objArr) {
            OutputStream openOutputStream;
            int i = 1;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Integer) ipChange.ipc$dispatch("3c207953", new Object[]{this, objArr});
            }
            Bitmap bitmap = (Bitmap) objArr[0];
            long currentTimeMillis = System.currentTimeMillis();
            ContentValues contentValues = new ContentValues();
            contentValues.put("relative_path", Environment.DIRECTORY_PICTURES);
            contentValues.put("_display_name", Integer.valueOf(bitmap.toString().hashCode()));
            contentValues.put("mime_type", Constants.SHARETYPE_WITH_QRCODE);
            long j = currentTimeMillis / 1000;
            contentValues.put("date_added", Long.valueOf(j));
            contentValues.put("date_modified", Long.valueOf(j));
            contentValues.put("date_expires", Long.valueOf((currentTimeMillis + 86400000) / 1000));
            contentValues.put("is_pending", (Integer) 1);
            ContentResolver contentResolver = LocalImageSaveFeature.access$700(LocalImageSaveFeature.this).getContentResolver();
            Uri insert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
            this.f8114a = insert;
            try {
                openOutputStream = contentResolver.openOutputStream(insert);
            } catch (IOException unused) {
                contentResolver.delete(this.f8114a, null, null);
            }
            if (bitmap.compress(Bitmap.CompressFormat.PNG, 100, openOutputStream)) {
                if (openOutputStream != null) {
                    openOutputStream.close();
                }
                contentValues.clear();
                contentValues.put("is_pending", (Integer) 0);
                contentValues.putNull("date_expires");
                contentResolver.update(this.f8114a, contentValues, null, null);
                i = 0;
                return Integer.valueOf(i);
            }
            throw new IOException("Failed to compress");
        }
    }

    public static /* synthetic */ String access$000(LocalImageSaveFeature localImageSaveFeature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c43ea3ad", new Object[]{localImageSaveFeature});
        }
        return localImageSaveFeature.mWaterMarkIconUrl;
    }

    public static /* synthetic */ Bitmap access$102(LocalImageSaveFeature localImageSaveFeature, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("54ffcef6", new Object[]{localImageSaveFeature, bitmap});
        }
        localImageSaveFeature.mWaterMarkBitmap = bitmap;
        return bitmap;
    }

    public static /* synthetic */ void access$200(LocalImageSaveFeature localImageSaveFeature, ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b48aeacf", new Object[]{localImageSaveFeature, imageView});
        } else {
            localImageSaveFeature.saveImageView(imageView);
        }
    }

    public static /* synthetic */ void access$300(LocalImageSaveFeature localImageSaveFeature, String str, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd8a730c", new Object[]{localImageSaveFeature, str, eVar});
        } else {
            localImageSaveFeature.fetchImage(str, eVar);
        }
    }

    public static /* synthetic */ void access$400(LocalImageSaveFeature localImageSaveFeature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36115d57", new Object[]{localImageSaveFeature});
        } else {
            localImageSaveFeature.dismissDialog();
        }
    }

    public static /* synthetic */ Context access$700(LocalImageSaveFeature localImageSaveFeature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("3aa68352", new Object[]{localImageSaveFeature});
        }
        return localImageSaveFeature.mContext;
    }

    public static /* synthetic */ void access$800(LocalImageSaveFeature localImageSaveFeature, Integer num, Uri uri, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e41ea4a9", new Object[]{localImageSaveFeature, num, uri, new Boolean(z)});
        } else {
            localImageSaveFeature.handleSaveResult(num, uri, z);
        }
    }

    private boolean checkSavePlan() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c74f98f9", new Object[]{this})).booleanValue();
        }
        if (Build.VERSION.SDK_INT > 28 || this.mContext.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            return false;
        }
        return true;
    }

    private Bitmap createWaterMaskBitmap(Bitmap bitmap) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("d7cda40f", new Object[]{this, bitmap});
        }
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        Bitmap bitmap2 = this.mWaterMarkBitmap;
        if (bitmap2 != null) {
            int width2 = bitmap2.getWidth();
            int height2 = this.mWaterMarkBitmap.getHeight();
            Rect rect = new Rect(0, 0, width2, height2);
            int size = getSize(width, 38);
            if (height2 != 0) {
                i = (width2 * size) / height2;
            } else {
                i = getSize(width, 160);
            }
            Rect rect2 = new Rect((width - i) - getSize(width, 20), (height - size) - getSize(width, 53), width - getSize(width, 20), height - getSize(width, 53));
            Paint paint = new Paint(1);
            paint.setShadowLayer(getSize(width, 1), 0.0f, getSize(width, 1), 2130706432);
            canvas.drawBitmap(this.mWaterMarkBitmap, rect, rect2, paint);
        }
        if (!TextUtils.isEmpty(this.mWaterMarkText)) {
            TextPaint textPaint = new TextPaint(1);
            textPaint.setColor(-460552);
            textPaint.setTextSize(getSize(width, 20));
            textPaint.setShadowLayer(getSize(width, 1), 0.0f, getSize(width, 1), 2130706432);
            canvas.drawText(this.mWaterMarkText, (width - getSize(width, 20)) - textPaint.measureText(this.mWaterMarkText), (height - getSize(width, 48)) - textPaint.getFontMetrics().top, textPaint);
        }
        canvas.save();
        canvas.restore();
        return createBitmap;
    }

    private void dismissDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfa707f9", new Object[]{this});
            return;
        }
        Dialog dialog = this.mDialog;
        if (dialog != null && dialog.isShowing()) {
            this.mDialog.dismiss();
            this.mDialog = null;
        }
    }

    private void fetchImage(String str, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd6e2a5a", new Object[]{this, str, eVar});
        } else {
            s0m.B().T(str).succListener(new d(this, eVar, str)).failListener(new c(this, eVar, str)).fetch();
        }
    }

    private Bitmap getBitmap(ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("fd1167c4", new Object[]{this, imageView});
        }
        Drawable drawable = imageView.getDrawable();
        Bitmap bitmap = null;
        if (drawable == null && (drawable = imageView.getBackground()) == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) drawable).getBitmap();
        }
        if (this.mWaterMarkBitmap == null && this.mWaterMarkText == null) {
            return bitmap;
        }
        return createWaterMaskBitmap(bitmap);
    }

    private static int getSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2c49b251", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        return (i2 * i) / 750;
    }

    private String getStringResource(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ab3e0739", new Object[]{this, new Integer(i)});
        }
        return this.mContext.getResources().getString(i);
    }

    public static /* synthetic */ Object ipc$super(LocalImageSaveFeature localImageSaveFeature, String str, Object... objArr) {
        if (str.hashCode() == 1336372353) {
            super.setHost((LocalImageSaveFeature) ((View) objArr[0]));
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/interactive_common/view/LocalImageSaveFeature");
    }

    private void notifyNewMedia(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd519d33", new Object[]{this, uri});
            return;
        }
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(uri);
        this.mContext.sendBroadcast(intent);
    }

    private void saveImageView(ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b88993e4", new Object[]{this, imageView});
            return;
        }
        Bitmap bitmap = getBitmap(imageView);
        this.mSaveBmp = bitmap;
        if (bitmap == null) {
            Toast.makeText(this.mContext.getApplicationContext(), getStringResource(R.string.uik_save_image_fail_get), 0).show();
        } else if (useMediaStore()) {
            h hVar = this.mSaveFileUseMediaStoreTask;
            if (hVar == null || AsyncTask.Status.RUNNING != hVar.getStatus()) {
                h hVar2 = new h(this, null);
                this.mSaveFileUseMediaStoreTask = hVar2;
                hVar2.execute(this.mSaveBmp);
            }
        } else if (checkSavePlan()) {
            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
            if (externalStoragePublicDirectory.exists() || externalStoragePublicDirectory.mkdirs()) {
                saveImageFile(Uri.fromFile(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).toString() + "/" + imageView.toString().hashCode() + ".png")), this.mSaveBmp);
                return;
            }
            Toast.makeText(this.mContext.getApplicationContext(), getStringResource(R.string.uik_save_image_fail), 0).show();
        } else {
            Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("image/*");
            intent.putExtra("android.intent.extra.TITLE", imageView.toString().hashCode() + ".png");
            Context context = this.mContext;
            while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (context == null || !(context instanceof Activity)) {
                Toast.makeText(this.mContext.getApplicationContext(), getStringResource(R.string.uik_save_image_fail), 0).show();
                return;
            }
            FragmentManager fragmentManager = ((Activity) context).getFragmentManager();
            LocalTBackFragment localTBackFragment = (LocalTBackFragment) fragmentManager.findFragmentByTag("LocalTBackFragment");
            if (localTBackFragment == null) {
                localTBackFragment = new LocalTBackFragment();
                fragmentManager.beginTransaction().add(localTBackFragment, "LocalTBackFragment").commit();
                fragmentManager.executePendingTransactions();
            }
            localTBackFragment.a(this);
            localTBackFragment.startActivityForResult(intent, 1502);
        }
    }

    private void showDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c637cac", new Object[]{this});
        } else if (this.mChoices.size() > 0) {
            Context context = this.mContext;
            if (context == null || !(context instanceof Activity) || !((Activity) context).isFinishing()) {
                this.mDialog = new Dialog(this.mContext, R.style.uik_imagesavedialog);
                LayoutInflater layoutInflater = (LayoutInflater) this.mContext.getSystemService("layout_inflater");
                ViewGroup viewGroup = (LinearLayout) layoutInflater.inflate(R.layout.uik_image_save_dialog, (ViewGroup) null);
                Iterator<String> it = this.mChoices.keySet().iterator();
                while (it.hasNext()) {
                    TextView textView = (TextView) layoutInflater.inflate(R.layout.uik_image_save_choice, viewGroup, false);
                    String next = it.next();
                    textView.setText(next);
                    textView.setOnClickListener(new b(this.mChoices.get(next)));
                    viewGroup.addView(textView);
                    if (it.hasNext()) {
                        viewGroup.addView(layoutInflater.inflate(R.layout.uik_choice_divider, viewGroup, false));
                    }
                }
                this.mDialog.setContentView(viewGroup);
                this.mDialog.show();
            }
        }
    }

    private boolean useMediaStore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e604ecf", new Object[]{this})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return false;
    }

    public void addDialogChoice(String str, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe2d31d2", new Object[]{this, str, fVar});
        } else {
            this.mChoices.put(str, fVar);
        }
    }

    @Override // com.taobao.uikit.feature.callback.TouchEventCallback
    public void afterDispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c82badcd", new Object[]{this, motionEvent});
        }
    }

    @Override // com.taobao.uikit.feature.callback.TouchEventCallback
    public void afterOnTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35369b32", new Object[]{this, motionEvent});
        }
    }

    @Override // com.taobao.uikit.feature.callback.ImageSaveCallback
    public void afterPerformLongClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6816ed0e", new Object[]{this});
        }
    }

    @Override // com.taobao.uikit.feature.callback.TouchEventCallback
    public void beforeDispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f585f570", new Object[]{this, motionEvent});
        }
    }

    @Override // com.taobao.uikit.feature.callback.TouchEventCallback
    public void beforeOnTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673c1915", new Object[]{this, motionEvent});
            return;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.mStartPoint.set(motionEvent.getX(), motionEvent.getY());
            this.mActive = true;
        } else if (action == 2) {
            float x = motionEvent.getX() - this.mStartPoint.x;
            float y = motionEvent.getY() - this.mStartPoint.y;
            if (Math.abs(x) > 10.0f || Math.abs(y) > 10.0f) {
                this.mActive = false;
                dismissDialog();
            }
        } else if (action == 5) {
            this.mActive = false;
            dismissDialog();
        }
    }

    @Override // com.taobao.uikit.feature.callback.ImageSaveCallback
    public void beforePerformLongClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec17f731", new Object[]{this});
        } else if (this.mActive) {
            showDialog();
        }
    }

    @Override // com.taobao.uikit.feature.features.AbsFeature
    public void constructor(Context context, AttributeSet attributeSet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8928939c", new Object[]{this, context, attributeSet, new Integer(i)});
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else if (i == 1502 && i2 == -1) {
            saveImageFile(intent.getData(), this.mSaveBmp);
        }
    }

    public void saveImageFile(Uri uri, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fda0188", new Object[]{this, uri, bitmap});
            return;
        }
        g gVar = this.mSaveFileTask;
        if (gVar == null || AsyncTask.Status.RUNNING != gVar.getStatus()) {
            g gVar2 = new g(this, null);
            this.mSaveFileTask = gVar2;
            gVar2.execute(uri, bitmap);
        }
    }

    public void setWater(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be088ef0", new Object[]{this, str, str2});
            return;
        }
        this.mWaterMarkText = str;
        this.mWaterMarkIconUrl = str2;
    }

    public void setHost(ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bf1252b", new Object[]{this, imageView});
            return;
        }
        super.setHost((LocalImageSaveFeature) imageView);
        Context context = imageView.getContext();
        this.mContext = context;
        if (context != null) {
            this.mChoices.put(context.getResources().getString(R.string.uik_save_image), new a());
        }
    }

    private void handleSaveResult(Integer num, Uri uri, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72b9bafb", new Object[]{this, num, uri, new Boolean(z)});
            return;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            Toast.makeText(this.mContext.getApplicationContext(), "图片已保存，请在手机相册中查看", 0).show();
            if (!z || checkSavePlan()) {
                notifyNewMedia(uri);
            }
        } else if (intValue == 1) {
            Toast.makeText(this.mContext.getApplicationContext(), "存储失败", 0).show();
        } else if (intValue == 2) {
            Toast.makeText(this.mContext.getApplicationContext(), "存储失败，可能存储空间不足", 0).show();
        }
    }
}
