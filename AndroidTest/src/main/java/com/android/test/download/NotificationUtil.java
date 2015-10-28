package com.android.test.download;

import android.content.Context;
import android.content.Intent;
import android.os.Environment;

/**
 * 通知工具类
 * notify util
 *
 * @author AigeStudio 2015-05-18
 */
public final class NotificationUtil {
    public static void notificationForDLAPK(Context context, String url) {
        notificationForDLAPK(context, url, Environment.getExternalStorageDirectory() + "/AigeStudio/");
    }

    public static void notificationForDLAPK(Context context, String url, String path) {
        Intent intent = new Intent(context, DLService.class);
        intent.putExtra("url", url);
        intent.putExtra("path", path);
        intent.putExtra("id", (int) (Math.random() * 1024));
        context.startService(intent);
    }
}
