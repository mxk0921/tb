package com.taobao.uikit.feature.features;

import android.app.Activity;
import android.app.Dialog;
import android.app.FragmentManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.alibaba.ability.hub.AbilityHubAdapter;
import com.alibaba.ability.impl.stdpop.StdPopAbility;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.feature.callback.ImageSaveCallback;
import com.taobao.uikit.feature.callback.TouchEventCallback;
import com.taobao.uikit.feature.view.TBackFragment;
import com.taobao.uikit.utils.FeatureSwitch;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.bia;
import tb.e9;
import tb.h9;
import tb.s2d;
import tb.xq;
import tb.zq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ImageSaveFeature extends AbsFeature<ImageView> implements ImageSaveCallback, TouchEventCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int IMAGE_SAVE_REQUEST_CODE = 1502;
    private Context mContext;
    private Dialog mDialog;
    private SaveFileTask mSaveFileTask;
    private final PointF mStartPoint = new PointF();
    private Bitmap mSaveBmp = null;
    private boolean mActive = false;
    private final HashMap<String, ImageSaveFeatureCallback> mChoices = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface ImageSaveFeatureCallback {
        void doMethod(ImageView imageView);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class SaveFileTask extends AsyncTask<Object, Void, Integer> {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final int FAIL_FULL = 2;
        private static final int FAIL_GET = 1;
        private static final int SUCCESS_SAVE = 0;
        private Uri mUri;

        private SaveFileTask() {
        }

        public static /* synthetic */ Object ipc$super(SaveFileTask saveFileTask, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/feature/features/ImageSaveFeature$SaveFileTask");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.AsyncTask
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
            this.mUri = (Uri) objArr[0];
            Bitmap bitmap = (Bitmap) objArr[1];
            if (bitmap != null) {
                FileOutputStream fileOutputStream2 = null;
                try {
                    parcelFileDescriptor = ImageSaveFeature.access$400(ImageSaveFeature.this).getContentResolver().openFileDescriptor(this.mUri, "w");
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

        public void onPostExecute(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("be14b67a", new Object[]{this, num});
                return;
            }
            int intValue = num.intValue();
            if (intValue == 0) {
                Toast.makeText(ImageSaveFeature.access$400(ImageSaveFeature.this).getApplicationContext(), ImageSaveFeature.access$500(ImageSaveFeature.this, R.string.uik_save_image_success), 0).show();
                if (ImageSaveFeature.access$600(ImageSaveFeature.this)) {
                    ImageSaveFeature.access$700(ImageSaveFeature.this, this.mUri);
                }
            } else if (intValue == 1) {
                Toast.makeText(ImageSaveFeature.access$400(ImageSaveFeature.this).getApplicationContext(), ImageSaveFeature.access$500(ImageSaveFeature.this, R.string.uik_save_image_fail_get), 0).show();
            } else if (intValue == 2) {
                Toast.makeText(ImageSaveFeature.access$400(ImageSaveFeature.this).getApplicationContext(), ImageSaveFeature.access$500(ImageSaveFeature.this, R.string.uik_save_image_fail_full), 0).show();
            }
        }
    }

    public static /* synthetic */ void access$000(ImageSaveFeature imageSaveFeature, ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df06cf29", new Object[]{imageSaveFeature, imageView});
        } else {
            imageSaveFeature.saveImageView(imageView);
        }
    }

    public static /* synthetic */ void access$100(ImageSaveFeature imageSaveFeature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d6afcf0", new Object[]{imageSaveFeature});
        } else {
            imageSaveFeature.dismissDialog();
        }
    }

    public static /* synthetic */ HashMap access$200(ImageSaveFeature imageSaveFeature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("3d4954d4", new Object[]{imageSaveFeature});
        }
        return imageSaveFeature.mChoices;
    }

    public static /* synthetic */ Context access$400(ImageSaveFeature imageSaveFeature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("5eff192b", new Object[]{imageSaveFeature});
        }
        return imageSaveFeature.mContext;
    }

    public static /* synthetic */ String access$500(ImageSaveFeature imageSaveFeature, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("119d22f1", new Object[]{imageSaveFeature, new Integer(i)});
        }
        return imageSaveFeature.getStringResource(i);
    }

    public static /* synthetic */ boolean access$600(ImageSaveFeature imageSaveFeature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80f7fcb9", new Object[]{imageSaveFeature})).booleanValue();
        }
        return imageSaveFeature.checkSavePlan();
    }

    public static /* synthetic */ void access$700(ImageSaveFeature imageSaveFeature, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cea12691", new Object[]{imageSaveFeature, uri});
        } else {
            imageSaveFeature.notifyNewMedia(uri);
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

    private Bitmap getBitmap(ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("fd1167c4", new Object[]{this, imageView});
        }
        Drawable drawable = imageView.getDrawable();
        if ((drawable != null || (drawable = imageView.getBackground()) != null) && (drawable instanceof BitmapDrawable)) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        return null;
    }

    private TBackFragment getOrCreateResultReceiveFragment() {
        FragmentManager fragmentManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBackFragment) ipChange.ipc$dispatch("ff2327f", new Object[]{this});
        }
        Context context = this.mContext;
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (!(context instanceof Activity)) {
            return null;
        }
        Activity activity = (Activity) context;
        Activity parent = activity.getParent();
        if (parent != null) {
            fragmentManager = parent.getFragmentManager();
        } else {
            fragmentManager = activity.getFragmentManager();
        }
        TBackFragment tBackFragment = (TBackFragment) fragmentManager.findFragmentByTag("TBackFragment");
        if (tBackFragment != null) {
            return tBackFragment;
        }
        TBackFragment tBackFragment2 = new TBackFragment();
        fragmentManager.beginTransaction().add(tBackFragment2, "TBackFragment").commit();
        fragmentManager.executePendingTransactions();
        return tBackFragment2;
    }

    private String getStringResource(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ab3e0739", new Object[]{this, new Integer(i)});
        }
        return this.mContext.getResources().getString(i);
    }

    public static /* synthetic */ Object ipc$super(ImageSaveFeature imageSaveFeature, String str, Object... objArr) {
        if (str.hashCode() == 1336372353) {
            super.setHost((ImageSaveFeature) ((View) objArr[0]));
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/feature/features/ImageSaveFeature");
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

    private void saveImageDirectly(ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b0aa9b5", new Object[]{this, imageView});
            return;
        }
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
        if (externalStoragePublicDirectory.exists() || externalStoragePublicDirectory.mkdirs()) {
            saveImageFile(Uri.fromFile(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).toString() + "/" + imageView.toString().hashCode() + ".png")), this.mSaveBmp);
            return;
        }
        Toast.makeText(this.mContext.getApplicationContext(), getStringResource(R.string.uik_save_image_fail), 0).show();
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
        } else if (checkSavePlan()) {
            saveImageDirectly(imageView);
        } else {
            saveImageWithSAF(imageView);
        }
    }

    private void saveImageWithSAF(ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f27bf7f5", new Object[]{this, imageView});
            return;
        }
        TBackFragment orCreateResultReceiveFragment = getOrCreateResultReceiveFragment();
        if (orCreateResultReceiveFragment == null) {
            Toast.makeText(this.mContext.getApplicationContext(), getStringResource(R.string.uik_save_image_fail), 0).show();
            return;
        }
        orCreateResultReceiveFragment.setImageSaveFeature(this);
        try {
            Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("image/*");
            intent.putExtra("android.intent.extra.TITLE", imageView.toString().hashCode() + ".png");
            orCreateResultReceiveFragment.startActivityForResult(intent, 1502);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(this.mContext.getApplicationContext(), getStringResource(R.string.uik_save_image_fail_multi_boxing), 0).show();
        }
    }

    private void showDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c637cac", new Object[]{this});
        } else if (FeatureSwitch.isSaveImageUseDesignTokenUIOpen()) {
            showDialogNew();
        } else {
            showDialogOld();
        }
    }

    private void showDialogNew() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b681cfc2", new Object[]{this});
            return;
        }
        zq zqVar = new zq("");
        zqVar.a(this.mContext);
        xq xqVar = new xq(zqVar);
        AbilityHubAdapter abilityHubAdapter = new AbilityHubAdapter(zqVar);
        String str = "uikit_image_save_" + System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        hashMap.put("name", "menu_select_pop");
        hashMap.put("version", "9");
        hashMap.put("url", "https://dinamicx.alibabausercontent.com/pub/menu_select_pop/1706178855808/menu_select_pop.zip");
        JSONObject jSONObject = new JSONObject(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("title", getStringResource(R.string.uik_save_image_title));
        Boolean bool = Boolean.FALSE;
        hashMap2.put("isCenter", bool);
        hashMap2.put("cancelText", getStringResource(R.string.uik_save_image_cancel));
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("title", (Object) getStringResource(R.string.uik_save_image));
        jSONObject2.put("iconText", (Object) "뎎");
        jSONObject2.put("isShowRightArrow", (Object) bool);
        jSONArray.add(jSONObject2);
        for (String str2 : this.mChoices.keySet()) {
            if (!str2.equals(getStringResource(R.string.uik_save_image))) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("title", (Object) str2);
                jSONObject3.put("iconText", (Object) "딞");
                jSONObject3.put("isShowRightArrow", (Object) Boolean.FALSE);
                jSONArray.add(jSONObject3);
            }
        }
        hashMap2.put(bia.UNDER_TAKE_GOODS_LIST, jSONArray);
        HashMap hashMap3 = new HashMap();
        hashMap3.put("popId", str);
        hashMap3.put("bizId", "megaability");
        HashMap hashMap4 = new HashMap(hashMap2);
        hashMap4.put("popId", str);
        JSONObject jSONObject4 = new JSONObject(hashMap4);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(e9.TAK_ABILITY_MATCH_CONTENT, Boolean.TRUE);
        JSONObject jSONObject5 = new JSONObject(hashMap5);
        HashMap hashMap6 = new HashMap();
        hashMap6.put("template", jSONObject);
        hashMap6.put("sharedEngine", Boolean.FALSE);
        JSONObject jSONObject6 = new JSONObject(hashMap6);
        hashMap3.put("content", jSONObject4);
        hashMap3.put(h9.KEY_POP_CONFIG, jSONObject5);
        hashMap3.put(h9.KEY_EXT_CONFIG, jSONObject6);
        abilityHubAdapter.z("stdPop", StdPopAbility.API_STD_DX, xqVar, new JSONObject(hashMap3), new s2d() { // from class: com.taobao.uikit.feature.features.ImageSaveFeature.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.s2d
            public void onCallback(ExecuteResult executeResult) {
                Map<String, Object> data;
                ImageSaveFeatureCallback imageSaveFeatureCallback;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                } else if (executeResult.getType().equals("onClose") && (data = executeResult.getData()) != null && data.containsKey("tabIndex")) {
                    Object obj = data.get("tabIndex");
                    if (!(obj instanceof Integer) || ((Integer) obj).intValue() != 0) {
                        Object obj2 = data.get("data");
                        if (obj2 instanceof JSONObject) {
                            Object obj3 = ((JSONObject) obj2).get("title");
                            if ((obj3 instanceof String) && (imageSaveFeatureCallback = (ImageSaveFeatureCallback) ImageSaveFeature.access$200(ImageSaveFeature.this).get(obj3)) != null) {
                                imageSaveFeatureCallback.doMethod(ImageSaveFeature.this.getHost());
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    ImageSaveFeature imageSaveFeature = ImageSaveFeature.this;
                    ImageSaveFeature.access$000(imageSaveFeature, imageSaveFeature.getHost());
                }
            }
        });
    }

    public void addDialogChoice(String str, ImageSaveFeatureCallback imageSaveFeatureCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6954b376", new Object[]{this, str, imageSaveFeatureCallback});
        } else {
            this.mChoices.put(str, imageSaveFeatureCallback);
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
        SaveFileTask saveFileTask = this.mSaveFileTask;
        if (saveFileTask == null || AsyncTask.Status.RUNNING != saveFileTask.getStatus()) {
            SaveFileTask saveFileTask2 = new SaveFileTask();
            this.mSaveFileTask = saveFileTask2;
            saveFileTask2.execute(uri, bitmap);
        }
    }

    private void showDialogOld() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f64e38c9", new Object[]{this});
        } else if (!this.mChoices.isEmpty()) {
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
                    final ImageSaveFeatureCallback imageSaveFeatureCallback = this.mChoices.get(next);
                    textView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.uikit.feature.features.ImageSaveFeature.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                                return;
                            }
                            imageSaveFeatureCallback.doMethod(ImageSaveFeature.this.getHost());
                            ImageSaveFeature.access$100(ImageSaveFeature.this);
                        }
                    });
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

    public void setHost(ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bf1252b", new Object[]{this, imageView});
            return;
        }
        super.setHost((ImageSaveFeature) imageView);
        Context context = imageView.getContext();
        this.mContext = context;
        if (context != null) {
            this.mChoices.put(context.getResources().getString(R.string.uik_save_image), new ImageSaveFeatureCallback() { // from class: com.taobao.uikit.feature.features.ImageSaveFeature.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.uikit.feature.features.ImageSaveFeature.ImageSaveFeatureCallback
                public void doMethod(ImageView imageView2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b6388dcd", new Object[]{this, imageView2});
                    } else {
                        ImageSaveFeature.access$000(ImageSaveFeature.this, imageView2);
                    }
                }
            });
        }
    }
}
