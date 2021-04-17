package com.example.android.archelon_sea_turtle_project.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings("unchecked")
public final class MorningSurveyDatabase_Impl extends MorningSurveyDatabase {
  private volatile MorningSurveyDatabaseDAO _morningSurveyDatabaseDAO;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Morning_survey_table` (`area` TEXT NOT NULL, `date` TEXT NOT NULL, `beach` TEXT NOT NULL, `sector` TEXT NOT NULL, `subsector` TEXT NOT NULL, `emergence_event` TEXT NOT NULL, `nest` TEXT NOT NULL, `distance_to_sea` TEXT NOT NULL, `track_type` TEXT NOT NULL, `non_nesting_attempts` TEXT NOT NULL, `gps_latitude` TEXT NOT NULL, `gps_longitude` TEXT NOT NULL, `tags` TEXT NOT NULL, `Tests` TEXT NOT NULL, `myphoto` TEXT NOT NULL, `nest_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"39533d090edba0e024383e0a6994ae52\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `Morning_survey_table`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsMorningSurveyTable = new HashMap<String, TableInfo.Column>(16);
        _columnsMorningSurveyTable.put("area", new TableInfo.Column("area", "TEXT", true, 0));
        _columnsMorningSurveyTable.put("date", new TableInfo.Column("date", "TEXT", true, 0));
        _columnsMorningSurveyTable.put("beach", new TableInfo.Column("beach", "TEXT", true, 0));
        _columnsMorningSurveyTable.put("sector", new TableInfo.Column("sector", "TEXT", true, 0));
        _columnsMorningSurveyTable.put("subsector", new TableInfo.Column("subsector", "TEXT", true, 0));
        _columnsMorningSurveyTable.put("emergence_event", new TableInfo.Column("emergence_event", "TEXT", true, 0));
        _columnsMorningSurveyTable.put("nest", new TableInfo.Column("nest", "TEXT", true, 0));
        _columnsMorningSurveyTable.put("distance_to_sea", new TableInfo.Column("distance_to_sea", "TEXT", true, 0));
        _columnsMorningSurveyTable.put("track_type", new TableInfo.Column("track_type", "TEXT", true, 0));
        _columnsMorningSurveyTable.put("non_nesting_attempts", new TableInfo.Column("non_nesting_attempts", "TEXT", true, 0));
        _columnsMorningSurveyTable.put("gps_latitude", new TableInfo.Column("gps_latitude", "TEXT", true, 0));
        _columnsMorningSurveyTable.put("gps_longitude", new TableInfo.Column("gps_longitude", "TEXT", true, 0));
        _columnsMorningSurveyTable.put("tags", new TableInfo.Column("tags", "TEXT", true, 0));
        _columnsMorningSurveyTable.put("Tests", new TableInfo.Column("Tests", "TEXT", true, 0));
        _columnsMorningSurveyTable.put("myphoto", new TableInfo.Column("myphoto", "TEXT", true, 0));
        _columnsMorningSurveyTable.put("nest_id", new TableInfo.Column("nest_id", "INTEGER", true, 1));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMorningSurveyTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMorningSurveyTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMorningSurveyTable = new TableInfo("Morning_survey_table", _columnsMorningSurveyTable, _foreignKeysMorningSurveyTable, _indicesMorningSurveyTable);
        final TableInfo _existingMorningSurveyTable = TableInfo.read(_db, "Morning_survey_table");
        if (! _infoMorningSurveyTable.equals(_existingMorningSurveyTable)) {
          throw new IllegalStateException("Migration didn't properly handle Morning_survey_table(com.example.android.archelon_sea_turtle_project.database.MorningSurvey).\n"
                  + " Expected:\n" + _infoMorningSurveyTable + "\n"
                  + " Found:\n" + _existingMorningSurveyTable);
        }
      }
    }, "39533d090edba0e024383e0a6994ae52", "b3bac27f77f086dd3709ee5afc933929");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "Morning_survey_table");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `Morning_survey_table`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public MorningSurveyDatabaseDAO getMorningSurveyDatabaseDAO() {
    if (_morningSurveyDatabaseDAO != null) {
      return _morningSurveyDatabaseDAO;
    } else {
      synchronized(this) {
        if(_morningSurveyDatabaseDAO == null) {
          _morningSurveyDatabaseDAO = new MorningSurveyDatabaseDAO_Impl(this);
        }
        return _morningSurveyDatabaseDAO;
      }
    }
  }
}
